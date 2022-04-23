package fromCodingBat.array2_Solutions;

public class More14 {

    public boolean more14(int[] nums) {

        int count1=0, count4=0;

        for (int each : nums) {

            if (each==1){count1++;}
            if (each==4){count4++;}

        }

        return count1>count4;

    }

}

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */