package fromCodingBat.string1_Solutions;

public class FirstTwo {

    public String firstTwo(String str) {

        switch(str.length()){

            case 0:
            case 1:
            case 2:
                return str;
            default:
                return str.substring(0, 2);

        }

    }

}

/*
Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
If the string is shorter than length 2, return whatever there is,
so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
 */