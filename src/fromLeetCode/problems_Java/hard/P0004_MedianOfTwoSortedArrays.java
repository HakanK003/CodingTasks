package fromLeetCode.problems_Java.hard;

import java.util.ArrayList;

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
 */



/**
 * Approach 1 -> Merge and Pick middle
 *
 *   Store all elements in a new sorted array. Then pick middle, if length is even take average.
 *
 * Time Complexity -> O(n+m)
 *   Loop through array once
 *
 * Space Complexity -> O(n+m)
 *   We assign values to new array
 *
 * Result
 *   Runtime: 5 ms, faster than 46.22% of Java online submissions for Median of Two Sorted Arrays.
 *   Memory Usage: 49.4 MB, less than 74.08% of Java online submissions for Median of Two Sorted Arrays.
 */
class Solution0004_1 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] all = new int[nums1.length + nums2.length];
        int x = 0, y = 0, z = 0;

        while (y < nums1.length && z < nums2.length) {

            if (nums1[y] < nums2[z]) {
                all[x] = nums1[y];
                x++;
                y++;
            } else {
                all[x] = nums2[z];
                x++;
                z++;
            }

        }

        for (; y < nums1.length; y++) {
            all[x] = nums1[y];
            x++;
        }
        for (; z < nums2.length; z++) {
            all[x] = nums2[z];
            x++;
        }

        if (all.length % 2 == 0) {
            return ((double) all[all.length / 2] + (double) all[(all.length / 2) - 1]) / 2;
        } else {
            return (double) all[all.length / 2];
        }
    }
}



/**
 * Approach 2 -> Binary Search
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
 *   Runtime: 3 ms, faster than 88.08% of Java online submissions for Median of Two Sorted Arrays.
 *   Memory Usage: 43.2 MB, less than 89.54% of Java online submissions for Median of Two Sorted Arrays.
 */
class Solution0004_2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;
        int k = 0;
        int limit = (n)/2 + 1;

        while (i < nums1.length && j < nums2.length && k < limit) {
            if (nums1[i] < nums2[j]) {
                arr.add(nums1[i]);
                i++;
            }
            else {
                arr.add(nums2[j]);
                j++;
            }
            k++;
        }

        if (i < nums1.length) {
            while (i < nums1.length && k < limit) {
                arr.add(nums1[i]);
                i++;
                k++;
            }
        } else {
            while (j < nums2.length && k < limit) {
                arr.add (nums2[j]);
                j++;
                k++;
            }
        }

        k--;

        return n%2 == 0 ? (double) (arr.get(k - 1) + arr.get(k)) / 2.0 : (double) arr.get(k);
    }
}



/**
 * Approach 3 -> Recursion
 *
 *   Same with first approach but using recursion instead of loops
 *
 * Time Complexity -> O(n+m)
 *   Merge two array using recursion
 *
 * Space Complexity -> O(n+m)
 *   New array has n+m element assigned
 *
 * Result
 *   Runtime: 5 ms, faster than 46.22% of Java online submissions for Median of Two Sorted Arrays.
 *   Memory Usage: 42.9 MB, less than 99.38% of Java online submissions for Median of Two Sorted Arrays.
 */
class Solution0004_3 {
    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {

        int[] all = new int[nums1.length + nums2.length];

        int x = 0;

        for (int j : nums1) {
            all[x] = j;
            x++;
        }
        for (int i : nums2) {
            all[x] = i;
            x++;
        }

        mergeSort(all);

        if (all.length % 2 == 0) {

            return ((double) all[all.length / 2] + (double) all[(all.length / 2) - 1]) / 2;

        } else {

            return (double) all[all.length / 2];

        }

    }


    public static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }
}

