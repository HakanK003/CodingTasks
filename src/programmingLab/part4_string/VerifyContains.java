package programmingLab.part4_string;

import java.util.Scanner;

public class VerifyContains {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE:

        scan.close();

        boolean itContains = sentence.contains(word);

        System.out.println(itContains);

    }

}

/*
Write a program that will verify if the sentence contains word. Print out the result as a boolean value.
 */