package fromLeetCode.problems_Java.sp_DataStructure_1.day06;

import java.util.ArrayList;
import java.util.HashMap;


/*
    Related Topics
    -> Hash Table
    -> String
    -> Counting

    Problem
    -> https://leetcode.com/problems/ransom-note/

        Given two strings ransomNote and magazine,
        return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
        Each letter in magazine can only be used once in ransomNote.


    Examples
    -> Example 1
            Input: ransomNote = "a", magazine = "b"
            Output: false
    -> Example 2
            Input: ransomNote = "aa", magazine = "ab"
            Output: false
    -> Example 3
            Input: ransomNote = "aa", magazine = "aab"
            Output: true

    Constraints
    -> 1 <= ransomNote.length, magazine.length <= 10^5
    -> ransomNote and magazine consist of lowercase English letters.
 */

/**
 * Approach 1 ->
 *
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(n)
 *
 *
 * Result
 *   Runtime: 28 ms, faster than 42.43% of Java online submissions for Ransom Note.
 *   Memory Usage: 54 MB, less than 11.21% of Java online submissions for Ransom Note.
 */
class Solution0383_1 {
    public boolean canConstruct(String ransomNote, String magazine) {

        ArrayList<Character> chars = new ArrayList<>();
        for (char ch : magazine.toCharArray())
            chars.add(ch);

        for (int i = 0; i < ransomNote.length(); i++) {
            char curr = ransomNote.charAt(i);
            if (chars.contains(curr)){
                chars.remove(chars.indexOf(curr));
            }else{
                return false;
            }
        }

        return true;
    }
}

/**
 * Approach 1 -> HashMap
 *
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime: 13 ms, faster than 58.77% of Java online submissions for Ransom Note.
 *   Memory Usage: 43.1 MB, less than 82.14% of Java online submissions for Ransom Note.
 */
class Solution0383_2 {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> counts = new HashMap<>();
        for (char ch : magazine.toCharArray())
            counts.put(ch, counts.getOrDefault(ch,0 )+1);

        for (int i = 0; i < ransomNote.length(); i++) {
            char curr = ransomNote.charAt(i);
            if (counts.containsKey(curr) && counts.get(curr) > 0){
                counts.put(curr, counts.get(curr)-1);
            }else{
                return false;
            }
        }

        return true;
    }
}


//sample 41800 KB submission
//class Solution {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        char[] freq = new char[26];
//        for(int i = 0; i<magazine.length(); i++){
//            char c = magazine.charAt(i);
//            freq[c-'a']++;
//        }
//        for(int i = 0; i<ransomNote.length(); i++){
//            char c = ransomNote.charAt(i);
//            if(freq[c-'a']-- <= 0) return false;
//        }
//
//        return true;
//    }
//}
//
//-------------------------------------------------------------------------
//sample 41600 KB submission
//class Solution {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        int[] arr = new int[26];
//        for(int i=0; i<ransomNote.length(); i++)
//            arr[ransomNote.charAt(i)-'a']++;
//        for(int i=0; i<magazine.length(); i++)
//            arr[magazine.charAt(i)-'a']--;
//        for(int i=0; i<arr.length;i++)
//            if(arr[i]>0)
//                return false;
//        return true;
//    }
//}