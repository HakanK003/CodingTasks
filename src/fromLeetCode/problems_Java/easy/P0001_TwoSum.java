package fromLeetCode.problems_Java.easy;

import java.util.HashMap;

/*
    Related Topics
    -> Array
    -> Hash Table

    Problem
    -> https://leetcode.com/problems/two-sum/

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



/**
 * Approach 1 -> Brute Force
 *
 *   Loop though array and check for each element of array if nums[j]==target-nums[i] exist in array.
 *   Then return indexes in new int[]{i, j}
 *
 * Time Complexity -> O(n^2)
 *   Nested 2 loops
 *
 * Space Complexity -> O(1)
 *   Declare array once and instantly
 *
 * Result
 *   Runtime: 278 ms, faster than 5.07% of Java online submissions for Two Sum.
 *   Memory Usage: 44.9 MB, less than 68.11% of Java online submissions for Two Sum.
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){

                if(i!=j && nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }

            }
        }

        return null;
    }
}



/**
 * Approach 2 -> Hash Map
 *
 *   target = num1 + num2 => assume that num1 = nums[i] so num2 should be target-num[i]
 *   Loop though array and check if map contains num2 as key
 *   If it doesn't contain store number and element in map as key=number value=index and continue to loop
 *
 * Time Complexity -> O(n)
 *   Array will be iterated once
 *
 * Space Complexity -> O(n)
 *   Put values to map n times
 *
 * Result
 *   Version 1
 *   Runtime: 6 ms, faster than 75.37% of Java online submissions for Two Sum.
 *   Memory Usage: 46 MB, less than 19.22% of Java online submissions for Two Sum.
 */
class Solution2 {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> pairs = new HashMap<>();
        pairs.put(nums[0],0);

        for (int i = 1; i < nums.length; i++) {
            if (pairs.containsKey(target-nums[i])){
                return new int[] {pairs.get(target-nums[i]), i};
            }else{
                pairs.put(nums[i],i);
            }
        }

        return null;
    }
}
