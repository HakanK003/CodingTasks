package fromCodingBat.logic1_Solutions;

public class LastDigit {

    public boolean lastDigit(int a, int b, int c) {

        return (a%10==b%10)||(a%10==c%10)||(c%10==b%10);

    }

}

/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */