package fromLeetCode.easy;

/*
    Related Topics
    -> Two Pointers
    -> String
*/

public class ReverseString_344 {

    //Runtime: 1 ms, faster than 99.94% of Java online submissions for Reverse String.
    //Memory Usage: 49.2 MB, less than 91.30% of Java online submissions for Reverse String.
    public void reverseString2(char[] s) {

        for (int i = 0, j = s.length; i < s.length/2; i++) {

            j--;

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

        }

    }

    //Runtime: 2 ms, faster than 43.89% of Java online submissions for Reverse String.
    //Memory Usage: 53.7 MB, less than 80.87% of Java online submissions for Reverse String.
    public void reverseString1(char[] s) {

        int i = 0, j = s.length - 1;

        while (i < j) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

    }

}
