package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Array
    -> Dynamic Programming

    Problem
    -> https://leetcode.com/problems/reverse-words-in-a-string/

        You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
        the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected
        and it will automatically contact the police if two adjacent houses were broken into on the same night.
        Given an integer array nums representing the amount of money of each house,
        return the maximum amount of money you can rob tonight without alerting the police.

    Examples
    -> Example 1
            Input: nums = [1,2,3,1]
            Output: 4
            Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
            Total amount you can rob = 1 + 3 = 4.
    -> Example 2
            Input: nums = [2,7,9,3,1]
            Output: 12
            Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
            Total amount you can rob = 2 + 9 + 1 = 12.

    Constraints
    -> 1 <= nums.length <= 100
    -> 0 <= nums[i] <= 400
 */



/**
 * Approach 1 -> Dynamic Programming
 *
 *
 * Time Complexity -> O(n)
 *
 * Space Complexity -> O(1)
 *
 *
 * Result
 *   Runtime 0 ms Beats 100% | Memory 39.5 MB Beats 97%
 */
class Solution0198_1 {
    public int rob(int[] nums) {

        if (nums.length==1) return nums[0];

        int max = nums[0], previousMax = 0;
        boolean addedPrevious = true;

        for (int i = 1; i < nums.length; i++) {

            if (!addedPrevious){
                previousMax = max;
                max+=nums[i];
                addedPrevious=true;
            }else if (nums[i] + previousMax > max) {
                int temp = max;
                max = previousMax + nums[i];
                previousMax = temp;
            }else{
                addedPrevious=false;
            }
        }

        return max;
    }
}

//https://leetcode.com/problems/house-robber/solutions/156523/from-good-to-great-how-to-approach-most-of-dp-problems/?orderBy=most_votes