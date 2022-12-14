package fromLeetCode.problems_Java.easy;

import java.util.HashMap;
import java.util.Map;

/*
    Related Topics
    -> Math
    -> Dynamic Programming
    -> Memoization

    Problem
    -> https://leetcode.com/problems/climbing-stairs/

        You are climbing a staircase. It takes n steps to reach the top.
        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    Examples
    -> Example 1
            Input: n = 2
            Output: 2
            Explanation: There are two ways to climb to the top.
                1. 1 step + 1 step
                2. 2 steps
    -> Example 2
            Input: n = 3
            Output: 3
            Explanation: There are three ways to climb to the top.
                1. 1 step + 1 step + 1 step
                2. 1 step + 2 steps
                3. 2 steps + 1 step

    Constraints
    -> 1 <= n <= 45
 */



/**
 * Approach 1 -> Math
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
 *   Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
 *   Memory Usage: 40.7 MB, less than 61.75% of Java online submissions for Climbing Stairs.
 *
 * Reference
 *   https://leetcode.com/problems/climbing-stairs/discuss/25296/3-4-short-lines-in-every-language
 */
class Solution0070_1 {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0)
            a = (b += a) - a;
        return a;
    }
}

/**
 * Approach 2 -> Dynamic Programming
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
 *   Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
 *   Memory Usage: 40.3 MB, less than 75.25% of Java online submissions for Climbing Stairs.
 *
 * Reference
 *   https://leetcode.com/problems/climbing-stairs/discuss/25299/Basically-it's-a-fibonacci.
 */
class Solution0070_2 {
    public int climbStairs(int n) {
        // base cases
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int one_step_before = 2;
        int two_steps_before = 1;
        int all_ways = 0;

        for(int i=2; i<n; i++){
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
    }
}







//https://leetcode.com/problems/climbing-stairs/discuss/963994/Java-from-Recursion-to-DP
/**
 * Recustion (Top Down Approach)
 * Question   : Climbing Stairs
 * Complexity : Time: O(2^n) ; Space: O(n)
 */
class Solution0070_3_1 {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}


/** Recustion + Memorization (Top Down Approach)
 * Question   : Climbing Stairs
 * Complexity : Time: O(n) ; Space: O(n)
 */
class Solution0070_3_2 {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        return memo.get(n);
    }
}


/**DP (Bottom Up Approach)
 * Question   : Climbing Stairs
 * Complexity : Time: O(n) ; Space: O(n)
 */
class Solution0070_3_3 {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

/**DP + Optimization (Bottom Up Approach)

 To calculate the new value we only leverage the previous two values. So we don't need to use an array to store all the previous values.

 * Question   : Climbing Stairs
 * Complexity : Time: O(n) ; Space: O(1)
 */
class Solution0070_3_4 {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }

        return prev2;
    }
}
