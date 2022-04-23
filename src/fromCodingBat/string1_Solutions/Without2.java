package fromCodingBat.string1_Solutions;

public class Without2 {

    public String without2(String str) {

        int x = str.length();

        switch(x){

            case 0:
            case 1:
                return str;
            case 2:
                return "";
            default:
                return (str.substring(0, 2).equals(str.substring(x-2,x)))? str.substring(2) : str;

        }

    }

}

/*
Given a string, if a length 2 substring appears at both its beginning and end,
return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
 */