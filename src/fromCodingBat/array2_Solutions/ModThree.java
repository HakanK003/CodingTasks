package fromCodingBat.array2_Solutions;

public class ModThree {

    public boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i]%2==nums[i+1]%2&&nums[i+1]%2==nums[i+2]%2){
                return true;
            }

        }

        return false;

    }

}

/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */