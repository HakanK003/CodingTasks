package fromLeetCode.problems_Java.easy;

import java.util.HashMap;
import java.util.LinkedList;

/*
    Related Topics
    -> Hash Table
    -> String
    -> Queue
    -> Counting

    Problem
    -> https://leetcode.com/problems/first-unique-character-in-a-string/submissions/

        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    Examples
    -> Example 1
            Input: s = "leetcode"
            Output: 0
    -> Example 2
            Input: s = "loveleetcode"
            Output: 2
    -> Example 3
            Input: s = "aabb"
            Output: -1

    Constraints
    -> 1 <= s.length <= 10^5
    -> s consists of only lowercase English letters.
 */



/**
 * Approach 1 -> Brute Force
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
 *   TLE
 */
class Solution0387_1 {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)) count++;
            }
            if (count==1) return i;
        }
        return -1;
    }
}



/**
 * Approach 2 -> HashMap + Queue
 *
 *   Such bad approach
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
 *   Runtime: 121 ms, faster than 5.13% of Java online submissions for First Unique Character in a String.
 *   Memory Usage: 54 MB, less than 34.68% of Java online submissions for First Unique Character in a String.
 */
class Solution0387_2 {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> counts = new HashMap<>();
        LinkedList<Integer> indexes = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
//            counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i), 0) + 1);
            char curr = s.charAt(i);
            if (counts.containsKey(curr)){
                counts.put(curr,counts.get(curr)+1 );
                indexes.removeFirstOccurrence(s.indexOf(curr));
            }else{
                counts.put(curr, 1);
                indexes.offer(i);
            }
        }

        return (indexes.isEmpty())? -1 : indexes.poll();
    }
}



/**
 * Approach 3 -> HashMap
 *
 *
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
 *   Runtime: 49 ms, faster than 44.69% of Java online submissions for First Unique Character in a String.
 *   Memory Usage: 54.7 MB, less than 9.60% of Java online submissions for First Unique Character in a String.
 */
class Solution0387_3 {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
            counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i), 0) + 1);

        for (int i = 0; i < s.length(); i++)
            if (counts.get(s.charAt(i)) == 1) return i;

        return -1;
    }
}



/**
 * Approach 3 -> Check First and Last index
 *
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
 *   Runtime: 2 ms, faster than 99.09% of Java online submissions for First Unique Character in a String.
 *   Memory Usage: 48.2 MB, less than 75.17% of Java online submissions for First Unique Character in a String.
 *
 * Reference
 *   Check submission details
 */
class Solution0387_4 {
    public int firstUniqChar(String s) {

        int ans = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int firstIdx = s.indexOf(c);
            if (firstIdx != -1 && firstIdx == s.lastIndexOf(c)) {
                ans = Math.min(ans, firstIdx);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}