package fromCodingBat.string1_Solutions;

public class LastTwo {

    public String lastTwo(String str) {

        int x = str.length();

        switch(x){

            case 0:
            case 1:
                return str;
            case 2:
                return ""+str.charAt(x-1)+str.charAt(0);
            default:
                return str.substring(0, x-2)+str.charAt(x-1)+str.charAt(x-2);
        }

    }

}

/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */