package programmingLab.part7_methods;

import java.util.Scanner;

public class RemoveFirstChar {

    public static String removeFirst(String target) {
        target = target.substring(1);
        return target;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
        in.close();
    }

}

/*
The method accepts a string and returns a string without the first character

Example:

removeFirst("aaa")
returns "aa"
 */