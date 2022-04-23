package fromCodingBat.warmup2_Solutions;

public class StringX {

    public String stringX(String str) {

        int a = str.length();

        if(a>2){
            return str.charAt(0)+str.substring(1, a-1).replace("x", "")+str.charAt(a-1);
        }

        return str;
    }



}

/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */