package fromLeetCode.problems_Java.easy;

import java.util.Arrays;

/*
    Related Topics
    -> Array
    -> Binary Search
    -> Greedy
    -> Sorting
    -> Prefix Sum

    Problem
    -> https://leetcode.com/problems/longest-subsequence-with-limited-sum/

        You are given an integer array nums of length n, and an integer array queries of length m.
        Return an array answer of length m where answer[i] is the maximum size of a subsequence that
        you can take from nums such that the sum of its elements is less than or equal to queries[i].
        A subsequence is an array that can be derived from another array by deleting some or no elements
        without changing the order of the remaining elements.

    Examples
    -> Example 1
            Input: nums = [4,5,2,1], queries = [3,10,21]
            Output: [2,3,4]
            Explanation: We answer the queries as follows:
                - The subsequence [2,1] has a sum less than or equal to 3. It can be proven that 2 is the maximum size of such a subsequence, so answer[0] = 2.
                - The subsequence [4,5,1] has a sum less than or equal to 10. It can be proven that 3 is the maximum size of such a subsequence, so answer[1] = 3.
                - The subsequence [4,5,2,1] has a sum less than or equal to 21. It can be proven that 4 is the maximum size of such a subsequence, so answer[2] = 4.
    -> Example 2
            Input: nums = [2,3,4,5], queries = [1]
            Output: [0]
            Explanation: The empty subsequence is the only subsequence that has a sum less than or equal to 1, so answer[0] = 0.

    Constraints
    -> n == nums.length
    -> m == queries.length
    -> 1 <= n, m <= 1000
    -> 1 <= nums[i], queries[i] <= 10^6
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
 *  Runtime 4 ms Beats 99.87% | Memory 42.9 MB Beats 88.20%
 *
 * Reference
 *   https://leetcode.com/problems/longest-subsequence-with-limited-sum/solutions/2493409/java-c-python-binary-search/
 */
class Solution2389_1 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length, m = queries.length, res[] = new int[m];
        for (int i = 1; i < n; ++i)
            nums[i] += nums[i - 1];
        for (int i = 0; i < m; ++i) {
            int j = Arrays.binarySearch(nums, queries[i]);
            res[i] = Math.abs(j + 1);
        }
        return res;
    }
}