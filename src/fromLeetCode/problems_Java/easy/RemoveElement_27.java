package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Array
    -> Two Pointers
 */

public class RemoveElement_27 {

    //Runtime: 1 ms, faster than 49.25% of Java online submissions for Remove Element.
    //Memory Usage: 42.1 MB, less than 78.78% of Java online submissions for Remove Element.
    public int removeElement(int[] nums, int val) {

        int pointer = nums.length;

        for (int i = nums.length-1; i >= 0; i--) {

            if (nums[i]==val) nums[i]=nums[--pointer];

        }

        return pointer;

    }

}
