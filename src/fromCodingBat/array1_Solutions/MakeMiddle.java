package fromCodingBat.array1_Solutions;

public class MakeMiddle {

    public int[] makeMiddle(int[] nums) {

        int[] middles = new int[2];

        int middleNo = nums.length/2-1;

        middles[0]=nums[middleNo];
        middles[1]=nums[middleNo+1];

        return middles;

    }

}

/*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */