package commonInterviewTasks.tasksFromYK;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] nums={4,1,6,2,8,5,9,3,7};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    private static int[] sortArray(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[i]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

}
