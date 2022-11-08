package fromLeetCode.problems_Java.medium;

public class IncreasingTripletSubsequence_334 {

    //Runtime: 3 ms, faster than 77.00% of Java online submissions for Increasing Triplet Subsequence.
    //Memory Usage: 93.3 MB, less than 54.55% of Java online submissions for Increasing Triplet Subsequence.
    public boolean increasingTriplet(int[] nums) {

        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;

        for (int n : nums) {

            if (n <= small) {
                small = n;
            }
            else if (n <= big) {
                big = n;
            }
            else {
                return true;
            }
        }

        return false;
    }

}
