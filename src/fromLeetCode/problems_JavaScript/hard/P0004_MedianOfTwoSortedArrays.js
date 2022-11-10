/*
    Related Topics
    -> Array
    -> Binary Search
    -> Divide and Conquer

    Problem
    -> https://leetcode.com/problems/median-of-two-sorted-arrays/

        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n)).

    Examples
    -> Example 1
            Input: nums1 = [1,3], nums2 = [2]
            Output: 2.00000
            Explanation: merged array = [1,2,3] and median is 2.
    -> Example 2
            Input: nums1 = [1,2], nums2 = [3,4]
            Output: 2.50000
            Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

    Constraints
    -> nums1.length == m
    -> nums2.length == n
    -> 0 <= m <= 1000
    -> 0 <= n <= 1000
    -> 1 <= m + n <= 2000
    -> -10^6 <= nums1[i], nums2[i] <= 10^6
    
    Notes
     * @param {number[]} nums1
     * @param {number[]} nums2
     * @return {number}
 */



 /**
  * Approach 1 -> Binary Search
  *
  *   Get sorted elements until middle element. Then return last element, if length is even take average of last 2 elements.
  *
  * Time Complexity -> O(log (m+n))
  *   Loop through array until middle of merged ((length1+length2)/2)
  *
  * Space Complexity -> O(log (m+n))
  *   We assign values to new list (m+n)/2 time
  *
  * Result
  *   Runtime: 119 ms, faster than 86.98% of JavaScript online submissions for Median of Two Sorted Arrays.
  *   Memory Usage: 46.4 MB, less than 84.82% of JavaScript online submissions for Median of Two Sorted Arrays.
  */
  var findMedianSortedArrays = function(nums1, nums2) {
          
        let n = nums1.length + nums2.length;
        const arr = [];
  
        let i = 0;
        let j = 0;
        let k = 0;
        let limit = (n)/2 + 1;
  
        while (i < nums1.length && j < nums2.length && k < limit) {
            if (nums1[i] < nums2[j]) {
                arr.push(nums1[i]);
                i++;
            } else {
                arr.push(nums2[j]);
                j++;
            }
            k++;
        }

        if (i < nums1.length) {
            while (i < nums1.length && k < limit) {
                arr.push(nums1[i]);
                i++;
                k++;
            }
        } else {
            while (j < nums2.length && k < limit) {
                arr.push (nums2[j]);
                j++;
                k++;
            }
        }
  
        k--;

        return n%2 == 0 ? (arr[k - 1] + arr[k]) / 2.0 : (n == 1)? arr[0] : arr[k - 1];
  };