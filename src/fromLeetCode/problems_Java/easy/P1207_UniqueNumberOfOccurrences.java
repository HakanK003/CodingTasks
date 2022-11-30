package fromLeetCode.problems_Java.easy;

import java.util.HashMap;
import java.util.HashSet;

/*
    Related Topics
    -> Array
    -> Hash Table

    Problem
    -> https://leetcode.com/problems/unique-number-of-occurrences/

       Given an array of integers arr, return true if the number of occurrences of each value in the array is unique,
       or false otherwise.

    Examples
    -> Example 1
            Input: arr = [1,2,2,1,1,3]
            Output: true
            Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1.
            No two values have the same number of occurrences.
    -> Example 2
            Input: arr = [1,2]
            Output: false
    -> Example 3
            Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
            Output: true

    Constraints
    -> 1 <= arr.length <= 1000
    -> -1000 <= arr[i] <= 1000
 */



/**
 * Approach 1 -> HashMap + HashSet
 *
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(n)
 *
 *
 * Result
 *   Runtime: 4 ms, faster than 67.10% of Java online submissions for Unique Number of Occurrences.
 *   Memory Usage: 41.5 MB, less than 77.68% of Java online submissions for Unique Number of Occurrences.
 *
 */
class Solution1207_1 {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (counts.containsKey(arr[i])) {
                counts.put(arr[i],counts.get(arr[i])+1 );
            }else{
                counts.put(arr[i],1 );
            }
        }

        HashSet<Integer> distinct = new HashSet<>(counts.values());
        return counts.size() == distinct.size();

    }
}