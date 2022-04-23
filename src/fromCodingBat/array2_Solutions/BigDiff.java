package fromCodingBat.array2_Solutions;

public class BigDiff {

    public int bigDiff(int[] nums) {

        int max= Integer.MIN_VALUE, min= Integer.MAX_VALUE;

        for (int each : nums) {

            if (each>max){max=each;}
            if (each<min){min=each;}

        }

        return max-min;
    }

}

/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
 */