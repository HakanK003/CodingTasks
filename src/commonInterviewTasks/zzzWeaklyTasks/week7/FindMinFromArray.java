package commonInterviewTasks.zzzWeaklyTasks.week7;

public class FindMinFromArray {

    public static void main(String[] args) {

        System.out.println("findMin(new int[] {9, 8, 6, 1, 7, 2, 3}) --> " + findMin(new int[]{9, 8, 6, 1, 7, 2, 3}));

    }

    public static int findMin(int[] nums){

        int min = nums[0];


        for (int each : nums) {

            if (min>each){min=each;}

        }

        return min;

    }

}

/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */