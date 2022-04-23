package fromCodingBat.logic1_Solutions;

public class TeenSum {

    public int teenSum(int a, int b) {

        return ((a>=13&&a<=19)||(b>=13&&b<=19))? 19 : a+b;

    }

}

/*
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
So if either value is a teen, just return 19.

teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
 */