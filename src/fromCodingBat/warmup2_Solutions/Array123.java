package fromCodingBat.warmup2_Solutions;

public class Array123 {

    public boolean array123(int[] nums) {

        boolean appear1 = false, appear2 = false, appear3 = false;

        for(int each : nums){

            if(each==1){appear1=true;}
            if(each==2){appear2=true;}
            if(each==3){appear3=true;}

        }

        return appear1&&appear2&&appear3;

    }

}

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */