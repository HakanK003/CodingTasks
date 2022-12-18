package fromLeetCode.problems_Java.medium;

import java.util.Stack;

/*
    Related Topics
    -> Array
    -> Stack
    -> Monotonic Stack

    Problem
    -> https://leetcode.com/problems/daily-temperatures/

        Given an array of integers temperatures represents the daily temperatures,
        return an array answer such that answer[i] is the number of days you have to wait after the ith day to
        get a warmer temperature.
        If there is no future day for which this is possible, keep answer[i] == 0 instead.

    Examples
    -> Example 1
            Input: temperatures = [73,74,75,71,69,72,76,73]
            Output: [1,1,4,2,1,1,0,0]
    -> Example 2
            Input: temperatures = [30,40,50,60]
            Output: [1,1,1,0]
    -> Example 3
            Input: temperatures = [30,60,90]
            Output: [1,1,0]

    Constraints
    -> 1 <= temperatures.length <= 10^5
    -> 30 <= temperatures[i] <= 100
 */



/**
 * Approach 1 ->
 *
 *
 *
 * Time Complexity -> O(n)
 *
 * Space Complexity -> O(n)
 *
 * Result
 *  Runtime 174 ms Beats 61.2% | Memory 136.2 MB Beats 40.2%
 *
 * Reference
 *   https://leetcode.com/problems/daily-temperatures/solutions/109832/java-easy-ac-solution-with-stack/
 */
class Solution0739_1 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;

    }
}