package programmingLab.part4_string;

import java.util.Scanner;

public class PrintLastCharacter {

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        scan.close();

        char lastChar = word.charAt(word.length()-1);

        System.out.println(lastChar);

    }

}

/*
Write a program that will print out last letter of the word (string).

Ex:
Input: java
Output: a
 */