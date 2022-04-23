package fromCodingBat.string1_Solutions;

public class FrontAgain {

    public boolean frontAgain(String str) {

        int x = str.length();

        return x>=2 && ( str.substring(0,2).equals( str.substring(x-2,x) ) );

    }


}

/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */