package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Array
    -> Two Pointers
 */

public class RemoveDuplicatesFromSortedArray_26 {

    //Runtime: 2 ms, faster than 68.03% of Java online submissions for Remove Duplicates from Sorted Array.
    //Memory Usage: 47.7 MB, less than 62.68% of Java online submissions for Remove Duplicates from Sorted Array.
    public int removeDuplicates(int[] nums) {

        int different =1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i]!=nums[i-1]) {
                nums[different] = nums[i];
                different++;
            }

        }

        return different;
    }

}
