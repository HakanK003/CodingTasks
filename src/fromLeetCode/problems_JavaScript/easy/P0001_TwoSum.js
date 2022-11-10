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
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
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
 *   Runtime: 210 ms, faster than 21.97% of JavaScript online submissions for Two Sum.
 *   Memory Usage: 42.6 MB, less than 58.01% of JavaScript online submissions for Two Sum.
 */
var twoSum = function(nums, target) {

    for (var i = 0; i < nums.length; i++) {

        for(var j = 0; j < nums.length; j++){

            if(i!=j && nums[i]+nums[j]==target){

                return [i, j];

            }
        }

    }

};




/**
 * Approach 2 -> Map
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
 *   Runtime: 110 ms, faster than 70.70% of JavaScript online submissions for Two Sum.
 *   Memory Usage: 43.2 MB, less than 28.92% of JavaScript online submissions for Two Sum.
 *   Version 2
 *   Runtime: 95 ms, faster than 86.01% of JavaScript online submissions for Two Sum.
 *   Memory Usage: 42.9 MB, less than 40.68% of JavaScript online submissions for Two Sum.
 */
var twoSum = function(nums, target) {
    const diffMap = new Map();

    for (let i = 0; i < nums.length; i++) {
        if (diffMap.has(nums[i])) {
            return [diffMap.get(nums[i]), i];
        } else {
            const diff = target - nums[i];
            diffMap.set(diff, i);
        }
    }

    return [-1, -1];
};

var twoSum = function(nums, target) {
	let hash = {};

	for(let i = 0; i < nums.length; i++) {
		const n = nums[i];
		if(hash[target - n] !== undefined) {
			return [hash[target - n], i];
		}
		hash[n] = i;
	}
	return [];
}