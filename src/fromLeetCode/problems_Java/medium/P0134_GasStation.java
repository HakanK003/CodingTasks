package fromLeetCode.problems_Java.medium;

import java.util.ArrayList;

/*
    Related Topics
    -> Array
    -> Greedy

    Problem
    -> https://leetcode.com/problems/gas-station/

        There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
        You have a car with an unlimited gas tank and it costs cost[i] of gas to travel
        from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
        Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit
        once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique

    Examples
    -> Example 1
            Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
            Output: 3
            Explanation:
                Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
                Travel to station 4. Your tank = 4 - 1 + 5 = 8
                Travel to station 0. Your tank = 8 - 2 + 1 = 7
                Travel to station 1. Your tank = 7 - 3 + 2 = 6
                Travel to station 2. Your tank = 6 - 4 + 3 = 5
                Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
                Therefore, return 3 as the starting index.
    -> Example 2
            Input: gas = [2,3,4], cost = [3,4,3]
            Output: -1
            Explanation:
                You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
                Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
                Travel to station 0. Your tank = 4 - 3 + 2 = 3
                Travel to station 1. Your tank = 3 - 3 + 3 = 3
                You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.
                Therefore, you can't travel around the circuit once no matter where you start.

    Constraints
    -> n == gas.length == cost.length
    -> 1 <= n <= 10^5
    -> 0 <= gas[i], cost[i] <= 10^4
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
 *   First
 *   Runtime 973 ms Beats 5.5% | Memory 55.7 MB Beats 99.34%
 *   Second
 *   Runtime 1066 ms Beats 5.5% | Memory 62.3 MB Beats 82.92%
 */
class Solution0134_1 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {

        ArrayList<Integer> possibleStarts = new ArrayList<>();
        for (int i = 0; i < gas.length; i++) {
            gas[i]-=cost[i];
            if (gas[i]>-1) possibleStarts.add(i);
        }

        for (Integer possibleStart : possibleStarts){
            int tank = 0, index = possibleStart, visitedStations = 0;
            for (int i = 0; i < gas.length; i++) {
                tank += gas[index];
                if (tank < 0) break;
                visitedStations++;
                if (visitedStations == gas.length) return possibleStart;
                if (tank == 0) break;
                index += 1;
                if (index >= gas.length) index -= gas.length;
            }
        }

        return -1;
    }
}


class Solution0134_1_2 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {

        for (int i = 0; i < gas.length; i++) {

            if (gas[i]-cost[i]>-1) {

                int tank = 0, index = i, visitedStations = 0;

                for (int j = 0; j < gas.length; j++) {
                    tank += gas[index]-cost[index];
                    if (tank < 0) break;
                    visitedStations++;
                    if (visitedStations == gas.length) return i;
                    if (tank == 0) break;
                    index += 1;
                    if (index >= gas.length) index -= gas.length;
                }
            }

        }

        return -1;
    }
}


//1ms sample solution
//
//Runtime 1 ms Beats 100% | Memory 62.7 MB Beats 64.94%
//
//class Solution0134_2 {
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int sumGas = 0, sumCost = 0;
//        for (int i = 0; i < gas.length; i++) {
//            sumGas += gas[i];
//            sumCost += cost[i];
//        }
//        if (sumGas < sumCost) return -1;
//
//        int total = 0;
//        int result = 0;
//        for(int i = 0; i < gas.length; i++) {
//            total += gas[i] - cost[i];
//
//            if(total < 0){
//                total = 0;
//                result = i + 1;
//            }
//        }
//
//        return result;
//    }
//}