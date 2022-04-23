package fromCodingBat.warmup1_Solutions;

public class StartOz {

    public String startOz(String str) {

        String s = "";


        if(str.length()>0){

            if(str.startsWith("o")){s+="o";}

            if(str.length()>1){

                if(str.charAt(1)=='z'){s+="z";}

            }

        }

        return s;

    }

}

/*
Given a string, return a string made of the first 2 chars (if present), however include first char
only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */