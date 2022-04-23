package fromCodingBat.string1_Solutions;

public class MiddleTwo {

    public String middleTwo(String str) {

        int x = str.length();

        return str.substring(x/2-1,x/2+1);

    }

}

/*
Given a string of even length, return a string made of the middle two chars,
so the string "string" yields "ri". The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */