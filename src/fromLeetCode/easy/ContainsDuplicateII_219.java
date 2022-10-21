package fromLeetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII_219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int a = 0;

        for (int i = 0; i < nums.length - k; i++) {

//            if ( i0 ik )
//                if ( i0numss == iknumss )
//                    return true;

        }

        return false;

    }

}

//    Map<Integer, Integer> map = new HashMap<>();
//    for (int i = 0; i < nums.length; i++) {
//      if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
//        return true;
//      }
//      map.put(nums[i], i);
//    }
//    return false;


//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//
//        int i, size = nums.length;
//        Set<Integer> s = new HashSet<Integer>();
//
//        for (i = 0; i < size; i++) {
//            if (i - k > 0) s.remove(nums[i - k - 1]);
//
//            if (s.contains(nums[i])) return true;
//
//            s.add(nums[i]);
//        }
//
//        return false;
//    }


//    bool containsNearbyDuplicate(vector<int>& nums, int k) {
//        uint8_t  size = nums.size() - 1;
//        for(uint8_t  i = 0; i < size; ++i)
//        {
//            for(uint8_t  j = i + 1; j <= size; ++j)
//                if((nums[i] == nums[j]) &&  j-i <= k)
//                    return true;
//        }
//
//        return false;
//
//    }