package commonInterviewTasks.zzzWeaklyTasks.week7;

import java.util.Arrays;

public class SortDescending {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortDescending(new int[]{1, 3, 4, 9, 7, 5, 2, 8, 4, 6, 0})));

        System.out.println(Arrays.toString(sortDescending2(new int[]{1, 3, 4, 9, 7, 5, 2, 8, 4, 6, 0})));

    }

    public static int[] sortDescending(int[] nums){

        int x = nums.length;

        int[] sorted = new int[x];

        int a = 0;

        for (int i = 0; i < x; i++) {

            int max = nums[i];
            int maxsIndex=i;

            for (int j = 0; j < x; j++) {

                if (max<nums[j]){
                    max=nums[j];
                    maxsIndex=j;
                }

            }


            sorted[a]=max;
            a++;

            nums[maxsIndex]=Integer.MIN_VALUE;

        }

        return sorted;

    }




    public static int[] sortDescending2(int[] numbers){

        int temp;

        for (int i = 0; i <numbers.length; i++) {


            for (int j = 0; j <numbers.length; j++) {

                if (numbers[i]>numbers[j]){

                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;

                }

            }


        }

        return numbers;
    }




}

/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */