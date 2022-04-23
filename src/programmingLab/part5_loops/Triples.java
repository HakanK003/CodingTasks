package programmingLab.part5_loops;

import java.util.Scanner;

public class Triples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        scan.close();

        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i,i+3).equals(""+str.charAt(i)+str.charAt(i)+str.charAt(i))){count+=1;}
        }

        System.out.println(count);



    }

}

/*
We'll say that a "triple" in a string is a char appearing three times in a row.
Print out the number of triples in the given string.
The triples may overlap.

Example:

input: abcXXXabc
output: 1

input: xxxabyyyycd
output: 3

input: java
output: 0
 */