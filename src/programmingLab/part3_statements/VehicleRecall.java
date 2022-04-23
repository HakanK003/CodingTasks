package programmingLab.part3_statements;

import java.util.Scanner;

public class VehicleRecall {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

        Scanner input = new Scanner(System.in);

        System.out.println("Enter vehicle's year:");
        int year = input.nextInt();

        input.close();

        String result;

        if((1995<=year&&1998>=year)||(2001<=year&&2002>=year)||(2004<=year&&2006>=year)||(2015<=year&&2017>=year)){result="Your vehicle needs to be recalled!";}else{result="Your vehicle is fine, enjoy!";}

        System.out.println(result);

    }

}

/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998, 2001-2002, 2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.

If the year is in the provided range print: Your vehicle needs to be recalled!

If the year is fine print: Your vehicle is fine, enjoy!

Example:

Enter vehicle's year:
1996
Your vehicle needs to be recalled!

Enter vehicle's year:
2018
Your vehicle is fine, enjoy!
 */