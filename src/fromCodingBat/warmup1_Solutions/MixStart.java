package fromCodingBat.warmup1_Solutions;

public class MixStart {

    public boolean mixStart(String str) {

        switch(str.length()){

            case 0:
            case 1:
            case 2:
                return false;
            default:
                return str.substring(1, 3).equals("ix");
        }

    }

}

/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */