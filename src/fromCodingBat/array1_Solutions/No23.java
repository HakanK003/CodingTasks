package fromCodingBat.array1_Solutions;

public class No23 {

    public boolean no23(int[] nums) {

        boolean yes = false;

        for(int each : nums){

            if(each==2||each==3){yes=true; break;}

        }

        return !yes;

    }

}

/*
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */