package fromCodingBat.array2_Solutions;

public class HaveThree {

    public boolean haveThree(int[] nums) {


        if(nums.length==0){return false;}

        int count3 =0;

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i]==3&&nums[i+1]==3){
                return false;
            }
            if (nums[i]==3){
                count3++;
            }


        }

        if (nums[nums.length-1]==3){
            count3++;
        }

        return count3==3;
    }

}

/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */