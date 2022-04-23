package programmingLab.part4_string;

import java.util.Scanner;

public class Email1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        // WRITE YOUR CODES HERE:
        scan.close();

        String result;

        int beginningIndex=email.indexOf("_");
        int endingIndex=email.indexOf("@");

        if(email.contains("_")){result=email.substring(beginningIndex+1,endingIndex)+"_"+email.substring(0, beginningIndex)+email.substring(endingIndex);}else{result=email;}

        System.out.println(result);

    }

}

/*
Swap first name with last name in the email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

input: barakobama@gmail.com
output: barakobama@gmail.com
 */