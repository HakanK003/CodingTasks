package programmingLab.part6_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLastChar2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //Write your code below
        input.close();

        String[] initials = new String[words.length];

        for(int i=0; i<words.length; i++){

            initials[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);

        }
        System.out.println(Arrays.toString(initials));

    }

}

/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.
Put each first and last letter in an array.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */