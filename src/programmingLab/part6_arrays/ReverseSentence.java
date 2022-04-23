package programmingLab.part6_arrays;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //start your code here
        input.close();

        String[] words = sentence.split(" ");

        for(int i =0, a=1; i<words.length/2; i++, a++){

            String station=words[i];
            words[i]=words[words.length-a];
            words[words.length-a]=station;

        }

        String result ="";

        for(String each : words){

            result+=each+" ";

        }

        System.out.println(result.trim());

    }

}

/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun
reversed > fun is Java
 */