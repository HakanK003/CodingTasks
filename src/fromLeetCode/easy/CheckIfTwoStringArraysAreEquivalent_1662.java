package fromLeetCode.easy;

/*
    Related Topics
    -> Array
    -> String
 */

public class CheckIfTwoStringArraysAreEquivalent_1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    //Runtime: 1 ms, faster than 95.64% of Java online submissions for Check If Two String Arrays are Equivalent.
    //Memory Usage: 41.6 MB, less than 78.48% of Java online submissions for Check If Two String Arrays are Equivalent.
    public boolean arrayStringsAreEqual3(String[] word1, String[] word2) {

        String str1, str2;

        if (word1.length==1){

            str1 = word1[0];

        }else{

            StringBuilder str11 = new StringBuilder();

            for (String value : word1) {
                str11.append(value);
            }

            str1 = str11.toString();
        }


        if (word2.length==1){

            str2 = word2[0];

        }else{

            StringBuilder str22 = new StringBuilder();

            for (String s : word2) {
                str22.append(s);
            }

            str2 = str22.toString();

        }


        return str1.equals(str2);

    }


    //Runtime: 1 ms, faster than 95.64% of Java online submissions for Check If Two String Arrays are Equivalent.
    //Memory Usage: 42 MB, less than 48.24% of Java online submissions for Check If Two String Arrays are Equivalent.
    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {

        StringBuilder str1 = new StringBuilder();

        for (String value : word1) {
            str1.append(value);
        }

        StringBuilder str2 = new StringBuilder();

        for (String s : word2) {
            str2.append(s);
        }

        return str1.toString().equals(str2.toString());

    }

    //Runtime: 2 ms, faster than 62.71% of Java online submissions for Check If Two String Arrays are Equivalent.
    //Memory Usage: 42.6 MB, less than 10.67% of Java online submissions for Check If Two String Arrays are Equivalent.
    public boolean arrayStringsAreEqual1(String[] word1, String[] word2) {

        String str1 = "";

        for (String value : word1) {
            str1 += value;
        }

        String str2 = "";

        for (String s : word2) {
            str2 += s;
        }

        return str1.equals(str2);

    }

}
