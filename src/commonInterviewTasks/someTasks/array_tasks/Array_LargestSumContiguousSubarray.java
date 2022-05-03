package commonInterviewTasks.someTasks.array_tasks;

public class Array_LargestSumContiguousSubarray {

    /*
    Largest Sum Contiguous Subarray
    Write a program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.
     */

    public static void main(String[] args) {

        System.out.println(maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));


    }


    public static int maxSum(int[] numbers){

        int max = 0, sum;

        for (int i =0; i< numbers.length; i++) {

            sum=0;

            for (int j =i; j< numbers.length; j++ ) {

                sum += numbers[j];

                max = Math.max(max, sum);

            }

        }

        return max;
    }

}
