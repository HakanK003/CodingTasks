/*
    Related Topics
    -> Array
    -> Two Pointers

    Problem
    -> https://leetcode.com/problems/remove-duplicates-from-sorted-array/

        Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
        The relative order of the elements should be kept the same.
        Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
        More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
        It does not matter what you leave beyond the first k elements.
        Return k after placing the final result in the first k slots of nums.
        Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

        Custom Judge:
            The judge will test your solution with the following code:

                int[] nums = [...]; // Input array
                int[] expectedNums = [...]; // The expected answer with correct length
                int k = removeDuplicates(nums); // Calls your implementation
                assert k == expectedNums.length;
                for (int i = 0; i < k; i++) {
                    assert nums[i] == expectedNums[i];
                }

            If all assertions pass, then your solution will be accepted.

    Examples
    -> Example 1
            Input: nums = [1,1,2]
            Output: 2, nums = [1,2,_]
            Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
            It does not matter what you leave beyond the returned k (hence they are underscores).
    -> Example 2
            Input: nums = [0,0,1,1,1,2,2,3,3,4]
            Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
            Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
            It does not matter what you leave beyond the returned k (hence they are underscores).

    Constraints
    -> 1 <= nums.length <= 3 * 10^4
    -> -100 <= nums[i] <= 100
    -> nums is sorted in non-decreasing order.

    Notes
     * @param {number[]} nums
     * @return {number}
 */


/**
 * Approach 1 -> Two pointers
 *
 *   Use a pointer to track which index was the last index for the different element. Loop trough array, when duplicate occurs
 *   change assign num[different] as duplicated. Array is in non-decreasing order, so we don't have to worry about previous indexes
 *
 * Time Complexity -> O(n)
 *   Loop through array once
 *
 * Space Complexity -> O(1)
 *   Reassign some values
 *
 * Result
 *   Runtime: 108 ms, faster than 80.19% of JavaScript online submissions for Remove Duplicates from Sorted Array.
 *   Memory Usage: 45 MB, less than 28.62% of JavaScript online submissions for Remove Duplicates from Sorted Array.
 */
 var removeDuplicates = function(nums) {

        let different =1;
        for (let i = 1; i < nums.length; i++) {

            if (nums[i]!=nums[i-1]) {
                nums[different] = nums[i];
                different++;
            }
        }

        return different;
 };

