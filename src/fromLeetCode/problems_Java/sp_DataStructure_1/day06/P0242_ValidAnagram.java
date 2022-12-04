package fromLeetCode.problems_Java.sp_DataStructure_1.day06;

/*
    Related Topics
    -> Hash Table
    -> String
    -> Sorting

    Problem
    -> https://leetcode.com/problems/valid-anagram/

        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
        typically using all the original letters exactly once.


    Examples
    -> Example 1
            Input: s = "anagram", t = "nagaram"
            Output: true
    -> Example 2
            Input: s = "rat", t = "car"
            Output: false

    Constraints
    -> 1 <= s.length, t.length <= 5 * 10^4
    -> s and t consist of lowercase English letters.

    Notes
     * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
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