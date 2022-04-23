package programmingLab.part4_string;

import java.util.Scanner;

public class FindTheLength {

    public static void main(String[] args) {
        //WRITER YOU CODE HERE
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String text = input.nextLine();

        input.close();

        int textLength = text.length();

        System.out.println("Length is: " + textLength);

    }

}

/*
Write a program that will output length of the text (string).

Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"
 */