package fromLeetCode.problems_Java.easy;

import java.util.HashMap;
import java.util.Map;

/*
    Related Topics
    -> Math

    Problem
    -> https://leetcode.com/problems/word-pattern/

        Given a pattern and a string s, find if s follows the same pattern.
        Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

    Examples
    -> Example 1
            Input: pattern = "abba", s = "dog cat cat dog"
            Output: true
    -> Example 2
            Input: pattern = "abba", s = "dog cat cat fish"
            Output: false
    -> Example 3
            Input: pattern = "aaaa", s = "dog cat cat dog"
            Output: false

    Constraints
    -> 1 <= pattern.length <= 300
    -> pattern contains only lower-case English letters.
    -> 1 <= s.length <= 3000
    -> s contains only lowercase English letters and spaces ' '.
    -> s does not contain any leading or trailing spaces.
    -> All the words in s are separated by a single space.
 */



/**
 * Approach 1 ->
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
 *   Runtime 1 ms Beats 95.21% | Memory 40.4 MB Beats 69%
 *
 * Reference
 *   https://leetcode.com/problems/word-pattern/solutions/73402/8-lines-simple-java/?orderBy=most_votes
 */
class Solution0290_1 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }
}