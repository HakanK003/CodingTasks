package programmingLab.part4_string;

import java.util.Scanner;

public class WithoutX_x {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODES
        scan.close();

        String result = word.replace("x","").replace("X","");

        System.out.println(result);

    }

}

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX
output: Hi

input: apple
output: apple

output: UxL
input: xUxL

input: JavaX
output: Java
 */