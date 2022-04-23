package programmingLab.part4_string;

import java.util.Scanner;

public class ReverseIt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:
        scan.close();

        String result="";

        if(word.length()==5){
            for(int i =word.length()-1; i>=0; i--){result +=word.charAt(i);}
        }else if (word.length()>5){result = "Too long!";}else{result = "Too short!";}

        System.out.println(result);

    }

}

/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.

Example:

input: cat
output: Too short!

input: singularity
output: Too long!

input: apple
output: elppa
 */