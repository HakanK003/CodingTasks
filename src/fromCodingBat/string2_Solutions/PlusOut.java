package fromCodingBat.string2_Solutions;

public class PlusOut {


    public String plusOut(String str, String word) {

        for (int i = 0; i < str.length() - word.length();) {

            if (!(str.substring(i,i+word.length()).equals(word))){
                str=str.replaceFirst(str.charAt(i)+"", "+");
                i++;
            }

            if ((str.substring(i,i+word.length()).equals(word))){
                i+=word.length();
            }

        }

        if (!(str.substring(str.length()-word.length()).equals(word))){

            for (int i = str.length()-word.length(); i < str.length(); i++) {

                if (word.charAt(word.length()-1)!=str.charAt(i)) {

                    str = str.replaceFirst(str.charAt(i) + "", "+");

                }

            }

        }

        return str;

    }

}

/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"),
except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */