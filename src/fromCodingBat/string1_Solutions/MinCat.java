package fromCodingBat.string1_Solutions;

public class MinCat {

    public String minCat(String a, String b) {

        int x = a.length();
        int y = b.length();

        int z = Math.min(x,y);

        return a.substring(x-z, x)+b.substring(y-z, y);

    }

}

/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 */