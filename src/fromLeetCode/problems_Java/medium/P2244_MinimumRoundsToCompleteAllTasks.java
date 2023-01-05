package fromLeetCode.problems_Java.medium;

import java.util.Arrays;
import java.util.HashMap;

/*
    Related Topics
    -> Array
    -> Hash Table
    -> Greedy
    -> Counting

    Problem
    -> https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/

        You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task.
        In each round, you can complete either 2 or 3 tasks of the same difficulty level.
        Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.

    Examples
    -> Example 1
            Input: tasks = [2,2,3,3,2,4,4,4,4,4]
            Output: 4
            Explanation: To complete all the tasks, a possible plan is:
                - In the first round, you complete 3 tasks of difficulty level 2.
                - In the second round, you complete 2 tasks of difficulty level 3.
                - In the third round, you complete 3 tasks of difficulty level 4.
                - In the fourth round, you complete 2 tasks of difficulty level 4.
                It can be shown that all the tasks cannot be completed in fewer than 4 rounds, so the answer is 4.
    -> Example 2
            Input: tasks = [2,3,3]
            Output: -1
                Explanation: There is only 1 task of difficulty level 2, but in each round,
                             you can only complete either 2 or 3 tasks of the same difficulty level.
                             Hence, you cannot complete all the tasks, and the answer is -1.

    Constraints
    -> 1 <= tasks.length <= 10^5
    -> 1 <= tasks[i] <= 10^9

 */


/**
 * Approach 1 ->
 *
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime 57 ms Beats 60.14% | Memory 103.8 MB Beats 43.77%
 *
 *  Reference
 *    https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/solutions/1955622/java-c-python-sum-up-freq-2-3/
 */
class Solution2244_1_1 {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int task : tasks)
            count.put(task, count.getOrDefault(task, 0) + 1);
        int res = 0;
        for (int freq : count.values()) {
            if (freq == 1) return -1;
            res += (freq + 2) / 3;
        }
        return res;
    }
}


//class Solution2244_2_2 {
//    public int minimumRounds(int[] tasks) {
//        Arrays.sort(tasks);
//        int res = 0;
//        for (int i = 0; i < tasks.length;) {
//            int j = i + 1;
//            while (j < tasks.length && tasks[j] == tasks[i]) j++;
//            if (j == i + 1) return -1;
//            res += compute(j - i);
//            i = j;
//        }
//        return res;
//    }
//
//    private int compute(int i) {
//        if (i % 3 == 0) return i / 3;
//        if (i % 3 == 2) return (i - 2) / 3 + 1;
//        return (i - 4) / 3 + 2;
//    }
//}

class Solution2244_2_1 {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int num = 0, result = 0;

        for (int i = 1; i < tasks.length; i++) {
            if (tasks[i-1]==tasks[i]){
                num++;
            }else{
                int times = 0;
                //logic;
                while(num-3>-1){
                    num=num-3;
                    times++;
                }

                if(num==2){
                    times++;
                }else if (num==1 && times>0){
                    times++;
                }else if (num==1) {
                    return -1;
                }


                result+=times;
                num=1;
            }
        }

        return result;
    }
}