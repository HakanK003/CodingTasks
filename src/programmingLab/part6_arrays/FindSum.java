package programmingLab.part6_arrays;

import java.util.Scanner;

public class FindSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // DO NOT TOUCH ABOVE
        //Write your code below
        input.close();

        int sum =0;

        for(int each : nums){
            sum+=each;
        }
        System.out.println(sum);



    }

}

/*
Given an array num, calculate the sum of all numbers in the array and print out to the console.

nums → [2, 1, 2, 3, 4]) → 12
nums → [2, 2, 0, 3, 5]) → 12
nums → [1, 3, 5, 7, 9]) → 25
 */