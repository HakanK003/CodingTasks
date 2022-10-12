package fromLeetCode.easy;

import java.util.Arrays;

public class LargestPerimeterTriangle_976 {

    //Runtime: 11 ms, faster than 72.56% of Java online submissions for Largest Perimeter Triangle.
    //Memory Usage: 53.6 MB, less than 81.20% of Java online submissions for Largest Perimeter Triangle.
    public int largestPerimeter3(int[] nums) {

        Arrays.sort(nums);

        if (nums.length==3) return (nums[0]+nums[1]>nums[2])?  nums[0]+nums[1]+nums[2]:0;

        for (int i = nums.length-1; i > 1; i--) {

            if((nums[i]<nums[i-1]+nums[i-2])) return nums[i]+nums[i-1]+nums[i-2];

        }

        return 0;
    }

    //Runtime: 13 ms, faster than 43.83% of Java online submissions for Largest Perimeter Triangle.
    //Memory Usage: 53.7 MB, less than 78.95% of Java online submissions for Largest Perimeter Triangle.
    public int largestPerimeter2(int[] nums) {

        if (nums.length==3) return ((nums[0]>=nums[1]+nums[2] || nums[0]<=Math.abs(nums[1]-nums[2])) || (nums[1]>=nums[0]+nums[2] || nums[1]<=Math.abs(nums[0]-nums[2]) || (nums[2]>=nums[1]+nums[0] || nums[2]<=Math.abs(nums[1]-nums[0])) ) )? 0 : nums[0]+nums[1]+nums[2];

        Arrays.sort(nums);

        for (int i = nums.length-1; i > 1; i--) {

            if((nums[i]>=nums[i-1]+nums[i-2] || nums[i]<=Math.abs(nums[i-1]-nums[i-2])) || (nums[i-1]>=nums[i]+nums[i-2] || nums[i-1]<=Math.abs(nums[i]-nums[i-2]) || (nums[i-2]>=nums[i-1]+nums[i] || nums[i-2]<=Math.abs(nums[i-1]-nums[i])) ) ) continue;

            return nums[i]+nums[i-1]+nums[i-2];

        }

        return 0;

    }


    //Runtime: 14 ms, faster than 25.92% of Java online submissions for Largest Perimeter Triangle.
    //Memory Usage: 54.4 MB, less than 38.33% of Java online submissions for Largest Perimeter Triangle.
    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        for (int i = nums.length-1; i > 1; i--) {

            if((nums[i]>=nums[i-1]+nums[i-2] || nums[i]<=Math.abs(nums[i-1]-nums[i-2])) || (nums[i-1]>=nums[i]+nums[i-2] || nums[i-1]<=Math.abs(nums[i]-nums[i-2]) || (nums[i-2]>=nums[i-1]+nums[i] || nums[i-2]<=Math.abs(nums[i-1]-nums[i])) ) ) continue;

            return nums[i]+nums[i-1]+nums[i-2];

        }

        return 0;

    }

}
