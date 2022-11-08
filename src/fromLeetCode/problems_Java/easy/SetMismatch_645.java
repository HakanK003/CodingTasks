package fromLeetCode.problems_Java.easy;

import java.util.HashMap;
import java.util.Map;

public class SetMismatch_645 {


    public int[] findErrorNums2(int[] nums) {

        int[] counts = new int[nums.length+1];
        for(int i : nums) counts[i]++;

        int duplicated = 0, deleted = 0;

        for (int i =1 ;i <counts.length; i ++) {
            if (counts[i]==2) duplicated=i;
            if (counts[i]==0) deleted=i;
        }

        return new int [] {duplicated, deleted};

    }


    public int[] findErrorNums(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            count.put(i+1, count.getOrDefault(i+1, 0)+1);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        int duplicated = 0, deleted = 0;

        for (Map.Entry<Integer, Integer> pairs : count.entrySet()) {
            if (pairs.getValue()==3) duplicated = pairs.getKey();
            if (pairs.getValue()==1) deleted = pairs.getKey();
        }

        return new int[] {duplicated, deleted};

    }

}
