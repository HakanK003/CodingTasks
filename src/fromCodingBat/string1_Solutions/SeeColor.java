package fromCodingBat.string1_Solutions;

public class SeeColor {

    public String seeColor(String str) {

        return (str.startsWith("blue"))? "blue" :(str.startsWith("red"))? "red" : "";

    }

}

/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */