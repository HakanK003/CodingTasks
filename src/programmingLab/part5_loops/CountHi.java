package programmingLab.part5_loops;

import java.util.Scanner;

public class CountHi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        scan.close();

        int before=str.length();

        str=str.replace("hi", "");

        int after=str.length();

        System.out.println((before-after)/2);


    }

}

/*
Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.

Example:

input: abc hi how hi
output: 2

input: hi code java please
output: 1
 */