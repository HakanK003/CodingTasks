package fromCodingBat.string1_Solutions;

public class MiddleThree {

    public String middleThree(String str) {

        int x = str.length();

        return str.substring(x/2-1,x/2+2);

    }

}

/*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */