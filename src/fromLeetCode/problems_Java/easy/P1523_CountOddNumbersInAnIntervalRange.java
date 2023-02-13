package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Math

    Problem
    -> https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

        Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

    Examples
    -> Example 1
            Input: low = 3, high = 7
            Output: 3
            Explanation: The odd numbers between 3 and 7 are [3,5,7].
    -> Example 2:
            Input: low = 8, high = 10
            Output: 1
            Explanation: The odd numbers between 8 and 10 are [9].

    Constraints
    -> 0 <= low <= high <= 10^9
 */


/**
 * Approach 1 ->
 *
 *
 * Time Complexity -> O(1)
 *
 * Space Complexity -> O(1)
 *
 * Result
 *   Runtime 0 ms Beats 100% | Memory 39.2 MB Beats 55.38%
 */
class Solution1523_1 {
    public int countOdds(int low, int high) {
        return (low%2!=1 && high%2!=1)? (high-low)/2 : ((high-low)/2)+1;
    }
}