package programmingLab.part7_methods;

import java.util.Scanner;

public class CleanString {

    public static String clean (String text , String badWord) {
        text+=" ";
        text = text.replace(badWord+" ","").trim();
        return text;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
        in.close();
    }


}

/*
This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said"
 */