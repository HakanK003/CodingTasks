package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Math
    -> Dynamic Programming
    -> Memoization

    Problem
    -> https://leetcode.com/problems/n-th-tribonacci-number/

        The Tribonacci sequence Tn is defined as follows:
        T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
        Given n, return the value of Tn.

    Examples
    -> Example 1
            Input: n = 4
            Output: 4
            Explanation:
                T_3 = 0 + 1 + 1 = 2
                T_4 = 1 + 1 + 2 = 4
    -> Example 2
            Input: n = 25
            Output: 1389537

    Constraints
    -> 0 <= n <= 37
    -> The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
 */


/**
 * Approach 1 -> Loop
 *
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime 0 ms Beats 100% | Memory 39.1 MB Beats 61.90%
 */
class SolutionP1137_1 {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int curr = 1, prev1 = 1, prev2 = 0;

        for (int i = 0; i < n - 2; i++) {
            int temp = curr + prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
            curr = temp;
        }

        return curr;
    }
}