package programmingLab.part5_loops;

import java.util.Scanner;

public class PrintLetters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        scan.close();

        for(char i =start; i<=end; i++){
            System.out.print(i);
        }

    }

}

/*
Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Example:

input:
A
Z
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

input:
a
f
output: abcdef

input:
a
d
output: abcd

input:
B
O
output: BCDEFGHIJKLMNO
 */