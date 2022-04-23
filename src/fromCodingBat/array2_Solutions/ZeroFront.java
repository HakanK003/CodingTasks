package fromCodingBat.array2_Solutions;

public class ZeroFront {

    public int[] zeroFront(int[] nums) {


        int temp;

        for (int i =nums.length-1; i >=0  ; i--) {

            for (int j = nums.length-1; j >= 0 ; j--) {

                if (nums[i]!=0){

                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;

                }

            }

        }
        return nums;

    }

}

/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array.
The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
 */