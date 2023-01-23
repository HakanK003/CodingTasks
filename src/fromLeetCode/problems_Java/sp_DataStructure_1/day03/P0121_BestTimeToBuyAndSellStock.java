package fromLeetCode.problems_Java.sp_DataStructure_1.day03;

/*
    Related Topics
    -> Array
    -> Dynamic Programming

    Problem
    -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan&id=data-structure-i

        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

    Examples
    -> Example 1
            Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    -> Example 2
            Input: nums = [3,2,4], target = 6
            Output: [1,2]
    -> Example 3
            Input: nums = [3,3], target = 6
            Output: [0,1]

    Constraints
    -> 2 <= nums.length <= 10^4
    -> -10^9 <= nums[i] <= 10^9
    -> -10^9 <= target <= 10^9
    -> Only one valid answer exists.

    Notes
     * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

//Test Cases
//[7,1,5,3,6,4]
//[7,6,4,3,1]
//[7,1]
//[7]
//[0]
//[1]
//[1,1]
//[0,1]
//[1,0]
//[7,1,5,3,6,4,10000]
//[10000, 1, 1, 1]
//[2,4,1]
//[5,8,2,4]

/**
 * Approach 1 ->
 *
 *
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(1)
 *
 *
 * Result
 *
 *
 */
class Solution0121_1 {
    public int maxProfit(int[] prices) {

        int buy = 0, sell = 0, profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i]<prices[buy]) buy = i;
            if (prices[i]>prices[sell] && i>buy) sell = i;


        }
        profit = prices[sell] - prices[buy];

        return (profit>0)? profit : 0;
    }
}


/**
 * Approach 2 -> Kadane
 *
 *
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(1)
 *
 *
 * Result
 *
 * Reference
 *   https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/39038/Kadane's-Algorithm-Since-no-one-has-mentioned-about-this-so-far-%3A)-(In-case-if-interviewer-twists-the-input)
 *
 */
class Solution0121_2 {

    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}


//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/712254/2-approaches-DP-and-Recursion-Time-O(n)-Space-O(1)
class Solution0121_3 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        return getMaxProfit(prices, 0, Integer.MAX_VALUE, 0);
    }

    public int getMaxProfit(int[] prices, int index, int minStockPrice, int maxDiff) {
        if(prices.length == index) {
            return maxDiff;
        }
        int earn =  prices[index] - minStockPrice;
        maxDiff = Math.max(earn, maxDiff);
        minStockPrice = Math.min(minStockPrice, prices[index]);
        return getMaxProfit(prices, ++index, minStockPrice, maxDiff);
    }
}

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/712254/2-approaches-DP-and-Recursion-Time-O(n)-Space-O(1)
class Solution0121_4 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        return getMaxProfit(prices);
    }

    public int getMaxProfit(int[] prices) {
        int minStockPrice = Integer.MAX_VALUE, maxDiff = 0;
        for(int i = 0; i < prices.length; i++) {
            int earn =  prices[i] - minStockPrice;
            maxDiff = Math.max(earn, maxDiff);
            minStockPrice = Math.min(minStockPrice, prices[i]);
        }
        return maxDiff;
    }
}

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/1505850/Java-Fastest-Greedy-Solution-100
//Runtime: 4 ms, faster than 56.39% of Java online submissions for Best Time to Buy and Sell Stock.
//Memory Usage: 83.9 MB, less than 30.09% of Java online submissions for Best Time to Buy and Sell Stock.
class Solution0121_5 {
    public int maxProfit(int[] prices) {

        int max=0,min=prices[0];
        for(int i=1;i<prices.length;i++)   {

            if(min<prices[i])
                max=Math.max(prices[i]-min,max);
            else
                min=prices[i];
        }
        return max;
    }
}