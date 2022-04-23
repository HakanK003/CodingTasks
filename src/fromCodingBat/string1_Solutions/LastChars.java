package fromCodingBat.string1_Solutions;

public class LastChars {

    public String lastChars(String a, String b) {

        return ( (a.isEmpty())? "@" : a.charAt(0)+"" ) + ( (b.isEmpty())? "@" : b.charAt(b.length()-1)+"" );

    }

}

/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
 */