package fromCodingBat.array2_Solutions;

public class Only14 {

    public boolean only14(int[] nums) {

        for (int each : nums) {

            if (each!=1&&each!=4){
                return false;
            }

        }

        return true;

    }

}

/*
Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true

 */