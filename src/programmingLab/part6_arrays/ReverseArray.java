package programmingLab.part6_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //write your code below
        input.close();

        for(int i =0, a=1; i<nums.length/2; i++, a++){
            int station=nums[i];
            nums[i]=nums[nums.length-a];
            nums[nums.length-a]=station;
        }

        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }

}

/*
Given an array nums with 7 integers already assigned, write code to reverse it.

Do not use any additional arrays or Strings.

Example:

nums -> [4, 3, 2, 44, 1, 100, 55]
nums -> [55, 100, 1, 44, 2, 3, 4]

PseudoCode:

Take values at index 0 and last index and swap them
Take values at index 0+1 and last index-1 and swap them
Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)

How to swap values:
int temp = nums[0];
nums[0] = nums[4];
nums[4] = temp;
 */