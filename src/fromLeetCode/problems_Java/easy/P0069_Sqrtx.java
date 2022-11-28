package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Math
    -> Binary Search

    Problem
    -> https://leetcode.com/problems/sqrtx/

        Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
        The returned integer should be non-negative as well.
        You must not use any built-in exponent function or operator.
            For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

    Examples
    -> Example 1
            Input: x = 4
            Output: 2
            Explanation: The square root of 4 is 2, so we return 2.
    -> Example 2
            Input: x = 8
            Output: 2
            Explanation: The square root of 8 is 2.82842...,
            and since we round it down to the nearest integer, 2 is returned.

    Constraints
    -> 0 <= x <= 231 - 1
 */



/**
 * Approach 1 -> Newton
 *
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime: 2 ms, faster than 83.33% of Java online submissions for Sqrt(x).
 *   Memory Usage: 41.4 MB, less than 41.51% of Java online submissions for Sqrt(x).
 *
 * Reference
 *   https://leetcode.com/problems/sqrtx/discuss/25057/3-4-short-lines-Integer-Newton-Every-Language
 */
class Solution0069_1 {
    public int mySqrt(int x) {
        long r = x;

        while (r*r > x)
            r = (r + x/r) / 2;

        return (int) r;
    }
}

/**
 * Approach 2 -> Binary Search
 *
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime: 2 ms, faster than 83.33% of Java online submissions for Sqrt(x).
 *   Memory Usage: 41.3 MB, less than 57.98% of Java online submissions for Sqrt(x).
 *
 * Reference
 *   https://leetcode.com/problems/sqrtx/discuss/25047/A-Binary-Search-Solution
 */
class Solution0069_2 {
    public int mySqrt(int x) {

        if (x == 0) return 0;

        int left = 1, right = Integer.MAX_VALUE;

        while (true) {

            int mid = left + (right - left)/2;

            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1)) return mid;

                left = mid + 1;
            }

        }
    }
}