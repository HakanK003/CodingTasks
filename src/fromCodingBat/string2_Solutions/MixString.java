package fromCodingBat.string2_Solutions;

public class MixString {

    public String mixString(String a, String b) {

        String result = "";

        int i=0, j=0;

        while(i<a.length() || j<b.length()){

            if (i<a.length()){
                result+=a.charAt(i);
                i++;
            }

            if (j<b.length()) {
                result+=b.charAt(j);
                j++;
            }

        }

        return result;

    }

}

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a,
the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */