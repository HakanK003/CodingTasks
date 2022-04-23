package fromCodingBat.warmup2_Solutions;

public class DoubleX {

    boolean doubleX(String str) {

        return (str.indexOf("x")!=(str.length()-1)) && str.charAt(str.indexOf("x") + 1) == 'x';

    }


}

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */