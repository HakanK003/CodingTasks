package programmingLab.part4_string;

import java.util.Scanner;

public class PrintTheLongestWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE
        scan.close();

        String result;

        if(word1.length()>word2.length()){result = word1;}
        else if(word2.length()>word1.length()){result = word2;}
        else{result = "Equals";}

        System.out.println(result);

    }

}

/*
Write a program that will print out the longest word. Note: Assume the length of the two given Strings will be different

input:
bill
check
output: check
 */