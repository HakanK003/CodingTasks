package programmingLab.part3_statements;

import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {

        //WRITE YOUR CODE HERE:

        Scanner input = new Scanner(System.in);

        System.out.println("Enter month number:");
        int number = input.nextInt();

        input.close();

        String result;

        switch(number){

            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Invalid month number";

        }

        System.out.println(result);

    }

}

/*
Write a program that will print out month names by receiving a number. Use Switch Statement.
If an invalid month number is entered print "Invalid month number"

Example:
Display message: "Enter month number:"
input: 5
Display message: "May"
 */