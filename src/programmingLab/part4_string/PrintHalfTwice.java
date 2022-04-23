package programmingLab.part4_string;

import java.util.Scanner;

public class PrintHalfTwice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:
        scan.close();

        String result = word.substring(0,(word.length()/2)).repeat(2);

        System.out.println(result);

    }

}

/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja

input: unity
output: unun
 */