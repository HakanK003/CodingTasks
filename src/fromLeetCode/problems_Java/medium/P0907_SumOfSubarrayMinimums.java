package fromLeetCode.problems_Java.medium;

import java.util.Stack;

/*
    Related Topics
    -> Array
    -> Dynamic Programming
    -> Stack
    -> Monotonic Stack

    Problem
    -> https://leetcode.com/problems/sum-of-subarray-minimums/

        Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr.
        Since the answer may be large, return the answer modulo 109 + 7.

    Examples
    -> Example 1
            Input: arr = [3,1,2,4]
            Output: 17
            Explanation:
            Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4].
            Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
            Sum is 17.
    -> Example 2
            Input: arr = [11,81,94,43,3]
            Output: 444

    Constraints
    -> 1 <= arr.length <= 3 * 10^4
    -> 1 <= arr[i] <= 3 * 10^4
 */




/**
 * Approach 1 -> Monotonic Stack - Contribution of Each Element
 *
 *   Check reference
 *
 * Time Complexity -> O(n)
 *   Check reference
 *
 * Space Complexity -> O(n)
 *   Check reference
 *
 * Result
 *   Runtime: 105 ms, faster than 59.51% of Java online submissions for Sum of Subarray Minimums.
 *   Memory Usage: 65.3 MB, less than 77.15% of Java online submissions for Sum of Subarray Minimums.
 *
 *  Reference
 *    https://leetcode.com/problems/sum-of-subarray-minimums/solution/
 */
class Solution0907_1 {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;

        Stack<Integer> stack = new Stack<>();
        long sumOfMinimums = 0;

        // building monotonically increasing stack
        for (int i = 0; i <= arr.length; i++) {

            // when i reaches the array length, it is an indication that
            // all the elements have been processed, and the remaining
            // elements in the stack should now be popped out.

            while (!stack.empty() && (i == arr.length || arr[stack.peek()] >= arr[i])) {

                // Notice the sign ">=", This ensures that no contribution
                // is counted twice. rightBoundary takes equal or smaller
                // elements into account while leftBoundary takes only the
                // strictly smaller elements into account

                int mid = stack.pop();
                int leftBoundary = stack.empty() ? -1 : stack.peek();
                int rightBoundary = i;

                // count of subarrays where mid is the minimum element
                long count = (mid - leftBoundary) * (rightBoundary - mid) % MOD;

                sumOfMinimums += (count * arr[mid]) % MOD;
                sumOfMinimums %= MOD;
            }
            stack.push(i);
        }

        return (int) (sumOfMinimums);
    }
}



/**
 * Approach 2 -> Monotonic Stack + Dynamic Programming
 *
 *   Check reference
 *
 * Time Complexity -> O(n)
 *   Check reference
 *
 * Space Complexity -> O(n)
 *   Check reference
 *
 * Result
 *   Runtime: 107 ms, faster than 57.41% of Java online submissions for Sum of Subarray Minimums.
 *   Memory Usage: 67.2 MB, less than 67.10% of Java online submissions for Sum of Subarray Minimums.
 *
 *  Reference
 *    https://leetcode.com/problems/sum-of-subarray-minimums/solution/
 */
class Solution0907_2 {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;

        Stack<Integer> stack = new Stack<>();

        // make a dp array of the same size as the input array `arr`
        int[] dp = new int[arr.length];

        // making a monotonic increasing stack
        for (int i = 0; i < arr.length; i++) {
            // pop the stack until it is empty or
            // the top of the stack is greater than or equal to
            // the current element
            while (!stack.empty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            // either the previousSmaller element exists
            if (stack.size() > 0) {
                int previousSmaller = stack.peek();
                dp[i] = dp[previousSmaller] + (i - previousSmaller) * arr[i];
            } else {
                // or it doesn't exist, in this case the current element
                // contributes with all subarrays ending at i
                dp[i] = (i + 1) * arr[i];
            }
            // push the current index
            stack.push(i);
        }

        // Add all elements of the dp to get the answer
        long sumOfMinimums = 0;
        for (int count : dp) {
            sumOfMinimums += count;
            sumOfMinimums %= MOD;
        }

        return (int) sumOfMinimums;
    }
}