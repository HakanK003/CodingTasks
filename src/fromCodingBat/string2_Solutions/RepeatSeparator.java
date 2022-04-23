package fromCodingBat.string2_Solutions;

public class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {

        String result ="";

        for (int i = 0; i < count; i++) {

            result+=word;

            if (count-1!=i){result+=sep;}

        }

        return result;

    }

}
