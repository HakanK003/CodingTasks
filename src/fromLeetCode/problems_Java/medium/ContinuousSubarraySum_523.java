package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Array
    -> Hash Table
    -> Math
    -> Prefix Sum
 */

import java.util.*;

public class ContinuousSubarraySum_523 {




//    public boolean checkSubarraySum5(int[] nums, int k) {
//
//        if (nums.length / 2 > k) return true; // Pigeonhole principle
//
//        ArrayList<Integer> subarraySums = new ArrayList<>();
//
//        for (int i = 1; i < nums.length; i++) {
//
//            if (subarraySums.contains(nums[i]%k))
//                return true;
//            else {
//                subarraySums = updateArrayList(subarraySums, nums[i]);
//            }
//
//        }
//
//        return false;
//    }
//
//    public static ArrayList<Integer> updateArrayList(ArrayList<Integer> nums, int number){
//
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for (Integer num : nums) {
//            result.add(num + number);
//        }
//
//        result.add(number);
//
//        return result;
//
//    }

    //[23,2,4,6,7]
    //6
    //[23,2,6,4,7]
    //6
    //[23,2,6,4,7]
    //13
    //[2,3, 4,5,6]
    //2
    //[2,3, 4,5,6]
    //3
    //[23,6,9]
    //6

    public boolean checkSubarraySum4(int[] nums, int k) {
        if (nums == null || nums.length == 0) return false;
        int n = nums.length;
        int[] dp = new int[n]; // sum up to index i
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = dp[j] - dp[i] + nums[i];
                if (sum == k || (k != 0 && sum % k == 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkSubarraySum3(int[] nums, int k) {
        k = k == 0 ? Integer.MAX_VALUE : Math.abs(k); // set k to positive for moding usage
        if (nums.length / 2 > k) return true; // Pigeonhole principle

        Set<Integer> set = new HashSet<>();
        int lastMod = 0;
        for (int num : nums) {
            int mod = (lastMod + num) % k;
            if (set.contains(mod)) return true;
            set.add(lastMod);
            lastMod = mod;
        }

        return false;
    }

    public boolean checkSubarraySum2(int[] nums, int k) {
        // initialize the hash map with index 0 for sum 0
        if (nums.length / 2 > k) return true; // Pigeonhole principle

        Map<Integer, Integer> hashMap = new HashMap<>(Map.of(0, 0));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // if the remainder sum % k occurs for the first time
            if (!hashMap.containsKey(sum % k))
                hashMap.put(sum % k, i + 1);
                // if the subarray size is at least two
            else if (hashMap.get(sum % k) < i)
                return true;
        }
        return false;
    }

    //Time Limit Exceeded
    public boolean checkSubarraySum1(int[] nums, int k) {

        int left = 0, right = 1;

        while(left < nums.length-1){

            int subarraySum =0;

            for (int i = left; i <= right; i++) {
                subarraySum+=nums[i];
            }

            if (right == nums.length-1){
                left++;
                right=left+1;
            }else{
                right++;
            }

            if (subarraySum % k == 0) {
                return true;
            }

        }

        return false;
    }

}

//TODO 19ms example solution
//
//    public boolean checkSubarraySum(int[] nums, int k)
//    {
//        int prefixSum = 0;
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        map.put(0, -1);
//
//        for (int i = 0; i < nums.length; i++)
//        {
//            prefixSum += nums[i];
//
//            // this is the twist
//            if (k != 0)
//            {
//                prefixSum = prefixSum % k;  //whose elements sum up to a multiple of k
//            }
//
//            // this is general
//            if (map.containsKey(prefixSum))
//            {
//                //  if nums has a continuous subarray of size at least two elements
//                if (i - map.get(prefixSum) > 1)
//                {
//                    return true;
//                }
//            }
//            else
//            {
//                map.put(prefixSum, i);  // adding the index
//            }
//        }
//        return false;
//    }


//TODO 53700kb example solution
//
//    public boolean checkSubarraySum(int[] nums, int k) {
//        for(int i=1;i<nums.length;i++) {
//            if(nums[i] == 0 && nums[i-1] == 0) return true;
//        }
//        for(int i=1;i<nums.length;i++) {
//            nums[i] += nums[i-1];
//            if(nums[i] % k ==0) return true;
//            int j = i;
//            while(j> 1 && nums[i] > k) {
//                if((nums[i] - nums[j-2]) % k ==0) {
//                    return true;
//                }
//                j--;
//            }
//        }
//        return false;
//    }