package fromCodingBat.logic2_Solutions;

import java.util.Arrays;

public class EvenlySpaced {

    public boolean evenlySpaced(int a, int b, int c) {

        int[] nums = {a, b, c};

        Arrays.sort(nums);

        return nums[0]-nums[1]==nums[1]-nums[2];

    }

}

/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */