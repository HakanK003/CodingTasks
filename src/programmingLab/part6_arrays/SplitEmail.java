package programmingLab.part6_arrays;

import java.util.Scanner;

public class SplitEmail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        input.close();

        if( email.length()-email.replace("@", "").length()==1){

            String[] outputs = email.split("@");
            System.out.println("Email id: " + outputs[0]+
                    "\nEmail domain: " + outputs[outputs.length-1]);
        }
        else{System.out.println("invalid email");}


    }

}

/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com
Output:
Email id: info
Email domain: cydeoschool.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
Output:
invalid email

email -> my@fancy@email.com
Output:
invalid email
 */