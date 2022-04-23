package programmingLab.part6_arrays;

import java.util.Scanner;

public class PrintFirstAndLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //Write your code below
        input.close();

        for( String each : words){
            System.out.println(""+each.charAt(0)+each.charAt(each.length()-1));
        }



    }

}

/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
ho
wy
by
ae
ne
 */