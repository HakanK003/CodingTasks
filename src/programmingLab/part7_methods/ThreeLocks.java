package programmingLab.part7_methods;

import java.util.Scanner;

public class ThreeLocks {

    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        return a && b || c;

    }//end threeLocks

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
        in.close();
    }

}

/*
threeLocks accepts 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

Hint: See truth table
 */