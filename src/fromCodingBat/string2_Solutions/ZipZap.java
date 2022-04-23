package fromCodingBat.string2_Solutions;

public class ZipZap{

    public String zipZap(String str) {

        if(str.length()<3){return str;}

        String[] letters = str.split("");

        for (int i = 0; i <letters.length; i++) {

            if (letters[i].equals("z")&&letters[i+2].equals("p")){letters[i+1]="";}

        }

        String result="";

        for (String each : letters) {

            result+= each;

        }

        return result;
    }

}

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */