package programmingLab.part4_string;

import java.util.Scanner;

public class SMSMessage {

    public static void main(String[] args) {
        // do not change:
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        //write your codes here:
        scan.close();

        int firstIndex = message.indexOf("<"),
                secondIndex = message.indexOf(">"),
                thirdIndex = message.indexOf("["),
                fourthIndex = message.indexOf("]"),
                fifthIndex = message.indexOf("{"),
                sixthIndex = message.indexOf("}");

        String sender=message.substring(firstIndex+1, secondIndex);
        String phoneNumber=message.substring(thirdIndex+1, fourthIndex);
        String messageBody=message.substring(fifthIndex+1, sixthIndex);

        System.out.println("Sender: "+sender+"\nPhone Number: "+phoneNumber+"\nMessage body: "+messageBody);

    }

}

/*
Given a String message in the following format: Sender:<Mike Smith>. From Number:[202-123-3456].
Message:{I love programing and problem-solving} assign the value of the sender, phoneNumber, and messageBody variables and print them.

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem-solving
 */