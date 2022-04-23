package fromCodingBat.warmup1_Solutions;

public class Front3 {

    public String front3(String str) {

        switch(str.length()){

            case 0:
                return "";
            case 1:
            case 2:
            case 3:
                return str+str+str;
            default:
                return str.substring(0, 3)+str.substring(0, 3)+str.substring(0, 3);

        }

    }

}

/*
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */