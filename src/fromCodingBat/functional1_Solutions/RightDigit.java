package fromCodingBat.functional1_Solutions;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {

    public List<Integer> rightDigit(List<Integer> nums) {

        return nums.stream().map(x->x%10).collect(Collectors.toList());

    }

}

/*
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]
 */