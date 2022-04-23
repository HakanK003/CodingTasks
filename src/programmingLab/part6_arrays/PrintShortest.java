package programmingLab.part6_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below
        scan.close();

        String[] words = str.split(", ");

        String min=words[0];

        for(String each : words){
            if(min.length()>each.length()){min=each;}
        }

        int count=0;

        for(String each2 : words){
            if(each2.length()==min.length()){count++;}
        }

        String[] result = new String[count];
        int arrIndex = 0;

        for(String each2 : words){
            if(each2.length()==min.length()){result[arrIndex]=each2; arrIndex++;}
        }

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));

    }

}

/*
Write a program that will find out the shortest words in the given string str.
If there are few words that are evenly short, print them all. Use split method in order to split str string variable and
create an array of strings. Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */