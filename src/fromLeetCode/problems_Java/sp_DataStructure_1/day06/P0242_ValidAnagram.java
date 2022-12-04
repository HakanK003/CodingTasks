package fromLeetCode.problems_Java.sp_DataStructure_1.day06;

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
 *   First
 *   Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Anagram.
 *   Memory Usage: 42.3 MB, less than 92.53% of Java online submissions for Valid Anagram.
 *   Second
 *   Runtime: 23 ms, faster than 31.16% of Java online submissions for Valid Anagram.
 *   Memory Usage: 43.3 MB, less than 75.15% of Java online submissions for Valid Anagram.
 */
class Solution0242_1_1 {
    public boolean isAnagram(String s, String t) {

        int[] countChars = new int[26];

        for (char ch : s.toCharArray())
            countChars[ch-'a']++;
        for (char ch : t.toCharArray())
            countChars[ch-'a']--;
        for (int i : countChars)
            if (i!=0) return false;

        return true;
    }
}

class Solution0242_1_2 {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;

        int[] countChars = new int[26];

        for(int i = 0; i < s.length(); i++) {
            countChars[s.charAt(i) - 'a'] ++;
            countChars[t.charAt(i) - 'a'] --;
        }

        for (int frequency : countChars)
            if (frequency!=0) return false;

        return true;
    }
}