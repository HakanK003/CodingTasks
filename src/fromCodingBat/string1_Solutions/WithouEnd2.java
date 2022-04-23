package fromCodingBat.string1_Solutions;

public class WithouEnd2 {

    public String withouEnd2(String str) {

        int x = str.length();

        return (x>2)? str.substring(1, x-1) : "" ;

    }

}

/*
Given a string, return a version without both the first and last char of the string.
The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */