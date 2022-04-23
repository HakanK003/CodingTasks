package programmingLab.part7_methods;

import java.util.Scanner;

public class StringWordCount {

    public static int wordCount(String words) {
        // your code
        String[] arr = words.split(" ");
        return arr.length;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
        in.close();
    }

}

/*
wordCount accepts String and returns how many words are in the given String

Example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

Hint: look at spaces
 */