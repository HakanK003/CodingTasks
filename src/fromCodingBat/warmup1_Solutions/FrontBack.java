package fromCodingBat.warmup1_Solutions;

public class FrontBack {

    public String frontBack(String str) {

        switch(str.length()) {

            case 0:
                return "";
            case 1:
                return str;
            case 2:
                return "" + str.charAt(str.length() - 1) + str.charAt(0);
            default:
                return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);

        }

    }

}

/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */