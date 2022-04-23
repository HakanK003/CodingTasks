package fromCodingBat.string2_Solutions;

public class WordEnds {

    public String wordEnds(String str, String word) {

        String result = "";

        for (int i = 0; i <= str.length() - word.length() ; i++) {

            if (str.substring(i, i+word.length()).equals(word)){

                if (i>0){
                    result += str.charAt(i-1);
                }
                if (i<str.length()-word.length()){
                    result += str.charAt(i+word.length());
                }


            }

        }

        return result;
    }

}

/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */