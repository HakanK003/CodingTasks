package fromCodingBat.string1_Solutions;

public class HasBad {

    public boolean hasBad(String str) {

        switch(str.length()){

            case 0:
            case 1:
            case 2:
                return false;
            case 3:
                return str=="bad";
            default:
                return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");


        }

    }

}

/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */