package fromCodingBat.array2_Solutions;

public class No14 {

    public boolean no14(int[] nums) {

        boolean no1 = true, no4 =true;

        for (int each : nums) {

            if (each==1){no1=false;}
            if (each==4){no4=false;}

        }

        return no1||no4;

    }

}

/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */