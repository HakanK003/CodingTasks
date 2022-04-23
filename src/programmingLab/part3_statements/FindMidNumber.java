package programmingLab.part3_statements;

import java.util.Scanner;

public class FindMidNumber {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = input.nextInt();
        System.out.println("Enter second number:");
        int n2 = input.nextInt();
        System.out.println("Enter third number:");
        int n3 = input.nextInt();

        input.close();

        int result = (n1>n2&&n3>n1)? (n1)
                :(n2>n1&&n3>n2)? (n2)
                : (n3);

        System.out.println("Medium value is: " + result);

    }

}

/*
Write a program that will return mid-number out of three numbers. No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.

Example:

Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25
Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25
Enter first number:
140
Enter second number:
34
Enter third number:
1

Medium value is: 34
 */