package fromCodingBat.array2_Solutions;

public class Either24 {

    public boolean either24(int[] nums) {

        boolean a2a2= false, a4a4= false;

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i]==2&&nums[i+1]==2){a2a2=true;}
            if (nums[i]==4&&nums[i+1]==4){a4a4=true;}

        }

        return ((a2a2 && !a4a4)||(!a2a2 && a4a4)) ;

    }

}

/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
 */