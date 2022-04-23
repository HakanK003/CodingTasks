package programmingLab.part5_loops;

import java.util.Scanner;

public class PrintStarNTimes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        scan.close();

        for(int i= 0; i<n; i++){
            System.out.print("*");
        }
    }

}

/*
Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.

Example:

input: 1
output: *

input: 3
output: ***
 */