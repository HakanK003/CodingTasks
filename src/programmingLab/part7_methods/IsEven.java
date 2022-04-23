package programmingLab.part7_methods;

import java.util.Scanner;

public class IsEven {

    public static boolean isEven(int n) {
        boolean even = false;
        if(n%2==0){even=true;}
        return even;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
        in.close();
    }

}

/*
isEven accepts a number and checks if it is even. If the given number is even return true, otherwise return false.

Examples:

isEven(1) --> false
isEven(8) --> true
 */