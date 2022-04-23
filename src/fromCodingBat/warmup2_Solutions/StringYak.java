package fromCodingBat.warmup2_Solutions;

import java.util.Objects;

public class StringYak {


    public String stringYak(String str) {


        String[] letters = str.split("");

        for (int i=0; i< letters.length-2; i++){

            if (Objects.equals(letters[i], "y") && Objects.equals(letters[i + 2], "k")){letters[i]="";letters[i+1]="";letters[i+2]="";i+=2;}

        }

        String result = "";

        for (String each : letters) {


            result+=each;

        }

        return result;

    }

}



/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */