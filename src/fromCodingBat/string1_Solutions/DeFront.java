package fromCodingBat.string1_Solutions;

public class DeFront {

    public String deFront(String str) {

        switch(str.length()){

            case 0:
                return str;
            case 1:
                return (str!="a")? "" : "a";
            case 2:
                return ( (str.charAt(0)=='a')? "a" : "" ) + ( (str.charAt(1)=='b')? "b" : "" );
            default:
                return ( (str.charAt(0)=='a')? "a" : "" ) + ( (str.charAt(1)=='b')? "b" : "" ) + str.substring(2);


        }

    }

}

/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */