package fromLeetCode.problems_Java.medium;

import java.util.Arrays;
import java.util.TreeMap;

/*
    Related Topics
    -> Array
    -> Binary Search
    -> Dynamic Programming
    -> Sorting

    Problem
    -> https://leetcode.com/problems/maximum-profit-in-job-scheduling/

        We have n jobs, where every job is scheduled to be done from startTime[i] to endTime[i],
        obtaining a profit of profit[i].
        You're given the startTime, endTime and profit arrays, return the maximum profit you can take
        such that there are no two jobs in the subset with overlapping time range.
        If you choose a job that ends at time X you will be able to start another job that starts at time X.

    Examples
    -> Example 1
            Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
            Output: 120
            Explanation: The subset chosen is the first and fourth job.
            Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.
    -> Example 2
            Input: startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
            Output: 150
            Explanation: The subset chosen is the first, fourth and fifth job.
            Profit obtained 150 = 20 + 70 + 60.
    -> Example 3
            Input: startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
            Output: 6

    Constraints
    -> 1 <= startTime.length == endTime.length == profit.length <= 5 * 10^4
    -> 1 <= startTime[i] < endTime[i] <= 10^9
    -> 1 <= profit[i] <= 10^4
 */



/**
 * Approach 1 -> Union Find
 *
 *   Check reference
 *
 * Time Complexity ->
 *   Check reference
 *
 * Space Complexity ->
 *   Check reference
 *
 * Result
 *   Runtime: 49 ms, faster than 78.45% of Java online submissions for Maximum Profit in Job Scheduling.
 *   Memory Usage: 51.4 MB, less than 90.08% of Java online submissions for Maximum Profit in Job Scheduling.
 *
 *  Reference
 *    https://leetcode.com/problems/maximum-profit-in-job-scheduling/discuss/409009/JavaC%2B%2BPython-DP-Solution
 */
class Solution1235_1 {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, (a, b)->a[1] - b[1]);
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] job : jobs) {
            int cur = dp.floorEntry(job[0]).getValue() + job[2];
            if (cur > dp.lastEntry().getValue())
                dp.put(job[1], cur);
        }
        return dp.lastEntry().getValue();
    }
}