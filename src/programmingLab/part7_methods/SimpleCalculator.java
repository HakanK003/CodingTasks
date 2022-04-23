package programmingLab.part7_methods;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        plus();
    }

    // Do not touch above

    public static void plus(){

        //your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = input.nextInt();
        System.out.println("enter second number:");
        int num2 = input.nextInt();
        input.close();

        System.out.println("result: "+(num1+num2));



    }

}

/*
Implement the plus method. The return type is void and has no arguments.

The method should ask the user to input two numbers, then it will add them and print the result.

Hint: Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */