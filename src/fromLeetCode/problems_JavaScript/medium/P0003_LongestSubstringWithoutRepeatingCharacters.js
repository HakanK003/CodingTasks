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

    Notes
     * @param {string} s
     * @return {number}
 */



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
  *    Runtime: 152 ms, faster than 59.57% of JavaScript online submissions for Longest Substring Without Repeating Characters.
  *    Memory Usage: 45.6 MB, less than 85.99% of JavaScript online submissions for Longest Substring Without Repeating Characters.
  *
  * Reference
  *   https://github.com/cherryljr/LeetCode/blob/master/Sliding%20Window%20Template.java
  *   https://github.com/cherryljr/LeetCode/blob/master/Longest%20Substring%20Without%20Repeating%20Characters.java
  */
  var lengthOfLongestSubstring = function(s) {
    let n = s.length;
    let ans = 0;
    // current index of character
    const map = new Map();
    // try to extend the range [i, j]
    for (let j = 0, i = 0; j < n; j++) {
        if (map.has(s.charAt(j))) {
            i = Math.max(map.get(s.charAt(j)), i);
        }
        ans = Math.max(ans, j - i + 1);
        map.set(s.charAt(j), j + 1);
    }
    return ans;
  };