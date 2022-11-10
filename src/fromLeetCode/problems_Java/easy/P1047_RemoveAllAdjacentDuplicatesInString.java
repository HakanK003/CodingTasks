package fromLeetCode.problems_Java.easy;

import java.util.LinkedList;
import java.util.Stack;

/*
    Related Topics
    -> String
    -> Stack

    Problem
    -> https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

        You are given a string s consisting of lowercase English letters.
        A duplicate removal consists of choosing two adjacent and equal letters and removing them.
        We repeatedly make duplicate removals on s until we no longer can.
        Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

    Examples
    -> Example 1
            Input: s = "abbaca"
            Output: "ca"
            Explanation:
            For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
            The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
    -> Example 2
            Input: s = "azxxzy"
            Output: "ay"

    Constraints
    -> 1 <= s.length <= 10^5
    -> s consists of lowercase English letters.
 */


/**
 * Approach 1 -> LinkedList
 *
 *   Make a linked list and put all characters. Then loop through list and remove duplicates.
 *   Use a pointer to make loop efficient, everytime when an object been removed set pointer = pointer-1.
 *   To be able to use pointer correctly, use an ' ' char after while loop remove it because we don't need that in result.
 *
 * Time Complexity -> O(n)<
 *   Loop through List once because we store index we remained. But it is still greater than O(n) because everytime we find
 *   duplicate index will be set to index = index-1 and also while loop probably run multiple times
 *
 * Space Complexity -> O(n)
 *   We assign values to list than remove. It is LinkedList, so it will be more efficient than ArrayList.
 *
 * Result
 *   Time Limit Exceeded
 */
class Solution1047_1 {
    public String removeDuplicates(String s) {

        LinkedList<Character> letters = new LinkedList<>();

        letters.add(' ');
        for (char ch : s.toCharArray()) {
            letters.add(ch);
        }

        int start = 0;

        while (!letters.isEmpty()) {
            int size = letters.size();
            for (; start < size - 1; start++) {
                if (letters.get(start) == letters.get(start + 1)) {
                    letters.remove(start);
                    letters.remove(start);
                    start--;
                    break;
                }
            }
            if (size == letters.size()) break;
        }

        letters.remove(0);
        StringBuilder result = new StringBuilder();

        for (Character ch : letters) {
            result.append(ch);
        }

        return result.toString();
    }
}


/**
 * Approach 2 -> Stack
 *
 *   Loop trough String and put chars to a Stack. If current char is equal to top char of stack, pop stack and skip that char.
 *
 * Time Complexity -> O(n)
 *   Loop through String once
 *
 * Space Complexity -> O(n)
 *   We assign values to Stack
 *
 * Result
 *   Runtime: 65 ms, faster than 67.83% of Java online submissions for Remove All Adjacent Duplicates In String.
 *   Memory Usage: 54.8 MB, less than 54.42% of Java online submissions for Remove All Adjacent Duplicates In String.
 */
class Solution1047_2 {
    public String removeDuplicates(String s) {

        Stack<Character> chars = new Stack<>();

        for (char currChar : s.toCharArray()) {

            if (!chars.isEmpty() && chars.peek() == currChar)
                chars.pop();
            else
                chars.add(currChar);
        }

        StringBuilder result = new StringBuilder();

        for (char currChar : chars)
            result.append(currChar);

        return result.toString();

    }
}

/**
 * Approach 3 -> Replace using Two Pointers
 *
 *   Make an array of chars. Then find duplicate chars, replace them with next chars.
 *
 * Time Complexity -> O(n)
 *   Loop through array
 *
 * Space Complexity -> O(n)
 *   We assign values to array
 *
 * Result
 *   Runtime: 19 ms, faster than 88.19% of Java online submissions for Remove All Adjacent Duplicates In String.
 *   Memory Usage: 48.9 MB, less than 73.66% of Java online submissions for Remove All Adjacent Duplicates In String.
 */
class Solution1047_3 {
    public String removeDuplicates(String s) {

        char[] res = s.toCharArray();
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i])
                i--;
            else
                i++;
        }
        return new String(res, 0, i);
    }
}