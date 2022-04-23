package fromCodingBat.string2_Solutions;

public class XyzThere {

    public boolean xyzThere(String str) {

        int count =0;

        for (int i = 0; i < str.length()-2; i++) {

            if (str.startsWith("xyz")||(str.substring(i, i+3).equals("xyz")&& !(str.charAt(i-1)=='.'))){count++;}

        }

        return count>0;

    }

}

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */