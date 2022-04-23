package programmingLab.part4_string;

import java.util.Scanner;

public class PrintFirstCharacter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        scan.close();

        char firstChar = word.charAt(0);

        System.out.println(firstChar);


    }

}

/*
Write a program that will print out the first character of the word.

Ex:

Input: jump
Output: j
 */