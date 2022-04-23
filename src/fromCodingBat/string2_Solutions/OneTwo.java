package fromCodingBat.string2_Solutions;

public class OneTwo {

    public String oneTwo(String str) {

        if(str.length()<3) {return "";}

        String result ="";

        char[] letters = str.toCharArray();

        for (int i = 0; i < letters.length-2; i++) {

            if (i % 3 == 0){

                char temp1 = letters[i+1];
                char temp2 = letters[i+2];
                letters[i+2]=letters[i];
                letters[i] = temp1;
                letters[i+1] = temp2;

                result+=""+letters[i]+letters[i+1]+letters[i+2];
            }

        }


        return result;

    }

}

/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */