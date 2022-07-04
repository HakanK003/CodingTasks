package fromLeetCode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum3(new int[]{2, 7, 11, 15}, 9)));

    }


    //Runtime: 278 ms, faster than 5.07% of Java online submissions for Two Sum.
    //Memory Usage: 44.9 MB, less than 68.11% of Java online submissions for Two Sum.
    public static int[] twoSum1(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){

            for(int j=0; j<nums.length; j++){

                if(i!=j && nums[i]+nums[j]==target){

                    return new int[] {i, j};

                }

            }

        }

        return null;

    }

    //Runtime: 116 ms, faster than 11.06% of Java online submissions for Two Sum.
    //Memory Usage: 44.4 MB, less than 79.05% of Java online submissions for Two Sum.
    public static int[] twoSum2(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;

    }

    //Runtime: 12 ms, faster than 45.45% of Java online submissions for Two Sum.
    //Memory Usage: 46.8 MB, less than 10.42% of Java online submissions for Two Sum.
    public static int[] twoSum3(int[] nums, int target){

        int[] result = new int[2];
        HashMap<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (pairs.containsKey(target-nums[i])){

                result[0]=pairs.get(target-nums[i]);
                result[1]=i;


            }else{

                pairs.put(nums[i],i);

            }

        }

        return result;

    }

    //Runtime: 3 ms, faster than 90.37% of Java online submissions for Two Sum.
    //Memory Usage: 45.9 MB, less than 26.18% of Java online submissions for Two Sum.
    public static int[] twoSum4(int[] nums, int target){

        HashMap<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (pairs.containsKey(target-nums[i])){

                return new int[] {pairs.get(target-nums[i]), i};

            }else{

                pairs.put(nums[i],i);

            }

        }

        return null;

    }

    //Runtime: 2 ms, faster than 93.89% of Java online submissions for Two Sum.
    //Memory Usage: 46.2 MB, less than 19.05% of Java online submissions for Two Sum.
    public static int[] twoSum5(int[] nums, int target){

        HashMap<Integer, Integer> pairs = new HashMap<>();
        pairs.put(nums[0],0);

        for (int i = 1; i < nums.length; i++) {

            if (pairs.containsKey(target-nums[i])){

                return new int[] {pairs.get(target-nums[i]), i};

            }else{

                pairs.put(nums[i],i);

            }

        }

        return null;

    }



}
