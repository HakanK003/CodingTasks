package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Array
    -> Binary Search
*/

public class SearchInsertPosition_35 {

    //TODO again
    public int searchInsert(int[] nums, int target) {

        int h = 0;
        int t = nums.length - 1;
        int m = ( h + t ) / 2;

        while( h <= t ){
            m = ( h + t ) / 2;
            if( nums[m] == target ){
                return m;
            }else if( nums[m] < target ){
                h = m + 1;
            }else{
                t = m - 1;
            }
        }
        return h;
    }


    public int searchInsert1(int[] nums, int target) {

        int middle = nums.length / 2;

        while (nums[middle] != target) {

            if (nums[middle] > target) {

                if ((middle == 0 || nums[middle - 1] < target)) return middle;

                middle /= 2;
            }
            if (nums[middle] < target) {

                if (middle == nums.length - 1 || nums[middle + 1] > target) return middle + 1;

                middle += (middle + Math.max(middle / 2, 1) > nums.length - 1) ? nums.length - 1 - middle : Math.max(middle / 2, 1);

            }

        }

        return middle;

    }



//    public static int searchInsert(int[] nums, int target) {
//
//        int low = 0, high = nums.length - 1;
//
//        while(low<=high){
//
//            int middle = low + (high - low) / 2;
//            int value = nums[middle];
//
//            if(value < target) {
//                if ((middle == 0 || nums[middle - 1] < target)) return middle;
//                low = middle + 1;
//            } else if(value > target) {
//                if (middle == nums.length - 1 || nums[middle + 1] > target) return middle + 1;
//                high = middle - 1;
//            }else return middle;
//
//        }
//
//        return -1;
//    }


//    private static int binarySearch(int[] array, int target) {
//
//        int low = 0;
//        int high = array.length - 1;
//
//        while(low <= high) {
//
//            int middle = low + (high - low) / 2;
//            int value = array[middle];
//
//            if(value < target) low = middle + 1;
//            else if(value > target) high = middle - 1;
//            else return middle;
//        }
//
//        return -1;
//    }

}
