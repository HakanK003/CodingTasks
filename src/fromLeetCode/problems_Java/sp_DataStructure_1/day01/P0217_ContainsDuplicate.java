package fromLeetCode.problems_Java.sp_DataStructure_1.day01;

import java.util.HashSet;

/*
    Related Topics
    -> Array
    -> Hash Table
    -> Sorting

    Problem
    -> https://leetcode.com/problems/contains-duplicate/

        Given an integer array nums, return true if any value appears at least twice in the array,
        and return false if every element is distinct.


    Examples
    -> Example 1
            Input: nums = [1,2,3,1]
            Output: true
    -> Example 2
            Input: nums = [1,2,3,4]
            Output: false
    -> Example 3
            Input: nums = [1,1,1,3,3,4,3,2,4,2]
            Output: true

    Constraints
    -> 1 <= nums.length <= 10^5
    -> -10^9 <= nums[i] <= 10^9
 */




/**
 * Approach 1 -> HashSet
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(n)
 *
 *
 * Result
 *   Runtime: 6 ms, faster than 96.79% of Java online submissions for Contains Duplicate.
 *   Memory Usage: 55 MB, less than 87.38% of Java online submissions for Contains Duplicate.
 *
 */
class Solution0217_1 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> checked = new HashSet<>();

        for(int i =0; i < nums.length; i++){

            if(checked.contains(nums[i])) return true;

            checked.add(nums[i]);
        }

        return false;
    }
}


/**
 * Approach 2 -> Sort
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(n)
 *
 *
 * Result
 *
 *
 */
class Solution0217_2 {
    public boolean containsDuplicate(int[] nums) {

        return false;
    }
}