package fromCodingBat.array1_Solutions;

public class Has23 {

    public boolean has23(int[] nums) {

        boolean yes = false;

        for(int each : nums){

            if (each == 2 || each == 3) {
                yes = true;
                break;
            }

        }

        return yes;

    }

}

/*
Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
 */