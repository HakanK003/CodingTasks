package programmingLab.part4_string;

import java.util.Scanner;

public class PrintFirstAndLast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:
        scan.close();

        String firstChar =""+ word.charAt(0);
        String lastChar =""+ word.charAt(word.length()-1);

        System.out.println(firstChar + lastChar);

    }

}

/*
Write a program that will print out first and last letters together.

Input: adobe
Output: ae
 */