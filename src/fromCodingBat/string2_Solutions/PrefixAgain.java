package fromCodingBat.string2_Solutions;

public class PrefixAgain {

    public boolean prefixAgain(String str, int n) {

        boolean yes = false;

        String checkSTR = str.substring(0, n);

        if(str.length()==2&&str.charAt(0)==str.charAt(1)){return true;}

        for (int i = 1; i < str.length()-n; i++) {

            if (str.substring(i, i+n).equals(checkSTR)){
                yes= true; break;
            }

        }

        return yes;
    }

}

/*
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */