package fromLeetCode.problems_Java.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
    Related Topics
    -> Hash Table
    -> String
    -> Sliding Window

    Problem
    -> https://leetcode.com/problems/longest-substring-without-repeating-characters/

        Given a string s, find the length of the longest substring without repeating characters.

    Examples
    -> Example 1
            Input: s = "abcabcbb"
            Output: 3
            Explanation: The answer is "abc", with the length of 3.
    -> Example 2
            Input: s = "bbbbb"
            Output: 1
            Explanation: The answer is "b", with the length of 1.
    -> Example 3
            Input: s = "pwwkew"
            Output: 3
            Explanation: The answer is "wke", with the length of 3.
            Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    Constraints
    -> 0 <= s.length <= 5 * 10^4
    -> s consists of English letters, digits, symbols and spaces.
 */



/**
 * Approach 1 -> Math with While Loop
 *
 *   Loop trough String and add chars to LinkedList. If List already contains char
 *
 * Time Complexity -> O(n)
 *
 * Space Complexity -> O(n)
 *
 * Result
 *   Runtime: 52 ms, faster than 16.89% of Java online submissions for Longest Substring Without Repeating Characters.
 *   Memory Usage: 45.2 MB, less than 44.89% of Java online submissions for Longest Substring Without Repeating Characters.
 */
class Solution0003_1 {
    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) return 0;

        int result = 0;
        LinkedList<Character> chars = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) {
                while (chars.contains(s.charAt(i))) {
                    chars.pop();
                }
            }
            chars.add(s.charAt(i));
            result = Math.max(chars.size(), result);

            if (result > chars.size() + (s.length() - i)) return result;

        }
        return result;
    }
}



/**
 * Approach 2 -> Sliding Window
 *
 *   Using Sliding Window Template
 *   Create a HashMap to save the Characters of the target substring.
 *   Two Pointers: begin - left pointer of the window; end - right pointer of the window
 *   Loop at the beginning of the source string
 *   Modify the counter according the requirement
 *   Move the left bound forward
 *
 * Time Complexity -> O(n).
 *   In optimized version index j will iterate n times.
 *
 * Space Complexity -> O(min(m, n))
 *
 *
 * Result
 *    Runtime: 13 ms, faster than 63.15% of Java online submissions for Longest Substring Without Repeating Characters.
 *    Memory Usage: 44.5 MB, less than 65.89% of Java online submissions for Longest Substring Without Repeating Characters.
 *    Optimized
 *    Runtime: 9 ms, faster than 74.21% of Java online submissions for Longest Substring Without Repeating Characters.
 *    Memory Usage: 44.8 MB, less than 54.09% of Java online submissions for Longest Substring Without Repeating Characters.
 *
 * Reference
 *   https://github.com/cherryljr/LeetCode/blob/master/Sliding%20Window%20Template.java
 *   https://github.com/cherryljr/LeetCode/blob/master/Longest%20Substring%20Without%20Repeating%20Characters.java
 */
class Solution0003_2 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int counter = 0;
        for (int left = 0, right = 0; right < s.length(); right++) {
            // count > 0 means repeating character
            char cRight = s.charAt(right);
            map.put(cRight, map.getOrDefault(cRight, 0) + 1);
            if (map.get(cRight) > 1) {
                counter++;
            }

            while (counter > 0) {
                char cLeft = s.charAt(left);
                map.put(cLeft, map.get(cLeft) - 1);
                // map.get(cLeft) == 1 means the cLeft is the duplicated character,
                // and we have remove it, so after left++, it will be distinct.
                if (map.get(cLeft) == 1) {
                    counter--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}

// The above solution requires at most 2n steps.
// In fact, it could be optimized to require only n steps.
// We could define a mapping of the characters to its index.
// Then we can skip the characters immediately when we found a repeated character.
//
// The reason is that if s[j] have a duplicate in the range [i, j) with index j',
// we don't need to increase i little by little. We can skip all the elements in the range [i, j']
// and let i to be j' + 1 directly.
class Solution0003_3 {
    public int lengthOfLongestSubstring7(String s) {
        int n = s.length(), ans = 0;
        // current index of character
        Map<Character, Integer> map = new HashMap<>();
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}

