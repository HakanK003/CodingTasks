package fromLeetCode.easy;

/*
    Related Topics
    -> Two Pointers
    -> String
*/

public class ReverseVowelsOfAString_345 {

    //Runtime: 8 ms, faster than 60.02% of Java online submissions for Reverse Vowels of a String.
    //Memory Usage: 43.4 MB, less than 85.43% of Java online submissions for Reverse Vowels of a String.
    public String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";
        char[] letters = s.toCharArray();

        int i = 0, j = s.length();

        while (i<j) {

            if (vowels.contains(""+letters[i])){

                while (i<j){

                    j--;

                    if (vowels.contains(""+letters[j])){

                        char temp = letters[i];
                        letters[i] = letters[j];
                        letters[j] = temp;
                        break;
                    }

                }

            }

            i++;
        }

        StringBuilder result = new StringBuilder();

        for (char letter : letters ) {
            result.append(letter);
        }

        return result.toString();

    }

}
