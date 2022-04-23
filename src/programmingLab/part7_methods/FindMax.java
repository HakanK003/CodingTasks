package programmingLab.part7_methods;

import java.util.Scanner;

public class FindMax {

    public static int max(int x, int max){
        // Code here
        int output=x;
        if(max>x){output=max;}
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
        in.close();
    }



}

/*
Finish the method max which has two parameters, x and max.

if x is bigger than max return x
if max is bigger than x return max
all other cases return x

Example:

max(1,10) -> 10
max(11,5) -> 11
 */