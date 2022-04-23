package fromCodingBat.array1_Solutions;

public class MaxTriple {

    public int maxTriple(int[] nums) {

        return Math.max(nums[0], Math.max( nums[nums.length-1], nums[(nums.length-1)/2]));

    }

}

/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */