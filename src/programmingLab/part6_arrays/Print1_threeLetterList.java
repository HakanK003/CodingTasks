package programmingLab.part6_arrays;

import java.util.Scanner;

public class Print1_threeLetterList {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        input.close();

        for(String each : arr){
            System.out.println(""+each.charAt(0)+each.charAt(1)+each.charAt(2));
        }


    }

}

/*
The code provided in your main method will take in five Strings and save them into an array called arr.
Print out the first three letter of each element on separate lines. You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]
Output:
hel
how
are
you
doi
 */