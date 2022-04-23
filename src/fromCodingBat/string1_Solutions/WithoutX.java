package fromCodingBat.string1_Solutions;

public class WithoutX {

    public String withoutX(String str) {

        if ( str.equals("")||str.equals("x") ){ return ""; }
        if( str.charAt(0)=='x' ){ str=str.substring(1); }
        if( str.charAt(str.length()-1)=='x' ){ str=str.substring(0, str.length()-1); }

        return str;

    }

}

/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */