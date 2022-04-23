package fromCodingBat.string2_Solutions;

public class StarOut {

    public String starOut(String str) {

        String[] letters = str.split("");

        String result = "";

        for (int i = 0; i < letters.length;) {

            if( letters[i].equals("*") && i==0 ){i+=2; continue;}

            if ( i!= letters.length-1 && letters[i+1].equals("*")){
                if ( i!= letters.length-2 && letters[i+2].equals("*")){
                    i+=1; continue;
                }
                i+=3; continue;
            }

            result+= letters[i];
            i++;
        }

        return result;

    }

}

/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */