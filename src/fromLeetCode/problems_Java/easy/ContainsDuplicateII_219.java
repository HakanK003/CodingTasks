package fromLeetCode.problems_Java.easy;

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


//Brute Force
//Easy, using 2 loops to determine whether there is the same number.
//
//obviously, it will time out.
//
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        if (nums == null || nums.length <= 1 || k <= 0) {
//            return false;
//        }
//
//        int len = nums.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = i + 1; j < len; j++) {
//                if (nums[i] == nums[j]) {
//                    if (Math.abs(i - j) <= k) {
//                        return true;
//                    }
//                }
//            }
//        }
//
//        return false;
//    }
//Analysis
//Time Complexity: O(n^2)
//Space Complexity: O(1)
//
//HashMap
//We use a HashMap to record the maximum index of each element. When scanning the array from left to right, the process:
//
//If an element nums[i] already exists in the hash table and the index j of the element recorded in the hash table satisfies i - j <= k, return true.
//
//Recording nums[i] and index i into the hash table, where i is the largest index of nums[i].
//
//The order of the above two-step operations cannot be changed, when the index i is traversed, the element equal to the current element and the maximum index of the element can only be found in the elements before the index i.
//
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        if (nums == null || nums.length <= 1 || k <= 0) {
//            return false;
//        }
//
//        int len = nums.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < len; i++) {
//            if (map.containsKey(nums[i])) {
//                int idx = map.get(nums[i]);
//                if (Math.abs(i - idx) <= k) {
//                    return true;
//                }
//                map.put(nums[i], i);
//            } else {
//                map.put(nums[i], i);
//            }
//        }
//
//        return false;
//    }
//Analysis
//Time Complexity: O(n)
//Space Complexity: O(n)
//
//Sliding Window
//Maintain a sliding window whose length does not exceed k+1 in the array nums, and the abs value of any two index delta in the same sliding window does not exceed k.
//
//If the sliding window has repeated elements, then there are two different index i and j such that nums[i] = nums[j] and i - j <= k.
//
//If there are no repeating elements in the sliding window, there is no index that meets the requirements.
//
//Therefore, it is only necessary to traverse each sliding window and determine whether there are duplicate elements in the sliding window.
//
//We use a HashSet to store the elements in the sliding window.
//
//If i>k, the element whose index is i-k-1 will be removed from the sliding window.
//
//If a element already exists in the HashSet, there are duplicate elements, return true, if not in the hash set add it to the hash set.
//
//public boolean containsNearbyDuplicate(int[] nums, int k) {
//	if (nums == null || nums.length <= 1 || k <= 0) {
//		return false;
//	}
//
//	int len = nums.length;
//	Set<Integer> set = new HashSet<>();
//	for (int i = 0; i < len; i++) {
//		if (i > k) {
//			set.remove(nums[i - k - 1]);
//		}
//
//		if (set.contains(nums[i])) {
//			return true;
//		} else {
//			set.add(nums[i]);
//		}
//	}
//
//	return false;
//}
//Analysis
//Time Complexity: O(n)
//Space Complexity: O(k)




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