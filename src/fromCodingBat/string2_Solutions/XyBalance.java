package fromCodingBat.string2_Solutions;

public class XyBalance {

    public boolean xyBalance(String str) {

        boolean balanced = false;

        String[] parts = str.split("y");

        return str.endsWith("y") || !(parts[parts.length-1].contains("x"));

    }

}

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */