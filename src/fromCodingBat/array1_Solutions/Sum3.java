package fromCodingBat.array1_Solutions;

public class Sum3 {

    public int sum3(int[] nums) {

        int sum=0;

        for(int each : nums){

            sum+=each;

        }

        return sum;

    }

}

/*
Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 */