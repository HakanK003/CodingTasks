package fromLeetCode.medium;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        int low = 0, high = 0, result = target >= 0 ? Integer.MAX_VALUE: Integer.MIN_VALUE, sum = 0;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i ++){

            low = i + 1; high = nums.length - 1;

            while(low < high){

                sum = nums[i] + nums[low] + nums[high];

                if(sum == target){
                    return target;
                } else{
                    result = Math.abs(sum - target) < Math.abs(result - target) ? sum: result;
                    if(sum < target) low++;
                    else high--;
                }

            }
        }

        return result;

    }

}

//closest = Math.min(Math.abs(target - (nums[i] + nums[j] + nums[i1])), closest);


//  Time Limit Exceeded
//        int closest = Integer.MAX_VALUE;
//        int result = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i+1; j < nums.length; j++) {
//
//                if (Arrays.stream(nums).equals(Math.abs(target-(nums[i]+nums[j])))
//
//                for (int i1 = j+1; i1 < nums.length; i1++) {
//
//                    if (Math.abs(target-(nums[i]+nums[j]+nums[i1]))<closest) {
//                        closest = Math.abs(target-(nums[i]+nums[j]+nums[i1]));
//                        result = nums[i]+nums[j]+nums[i1];
//                        if(closest==0) return result;
//
//                    }
//
//                }
//
//            }
//
//        }
//
//        return result;