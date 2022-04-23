package fromCodingBat.array2_Solutions;

public class Has12 {

    public boolean has12(int[] nums) {

        boolean a2= false,  a1 = false;

        for (int each : nums) {

            if (each == 1) {
                a1 = true;
            }
            if (each == 2 && a1) {
                a2 = true;
            }

        }

        return a2&&a1;

    }

}

/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */