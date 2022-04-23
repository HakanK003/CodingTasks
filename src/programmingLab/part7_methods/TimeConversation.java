package programmingLab.part7_methods;

import java.util.Scanner;

public class TimeConversation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
        scan.close();
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        if(s.contains("AM")&&!s.contains("12")){System.out.println(s.replace("AM",""));}
        if(s.contains("AM")&&s.contains("12")){System.out.println(s.replace("AM","").replace("12","00"));}
        if(s.contains("PM")&&s.contains("12")){System.out.println(s.replace("PM","").replace(" ", ""));System.exit(0);}
        if(s.contains("PM")){
            String result="";
            String hour ="";
            if(s.length()==10){hour = s.substring(0,2); result=s.substring(2,s.length()-2);}
            if(s.length()==9) {hour = s.substring(0,1); result=s.substring(1,s.length()-2);}
            switch(hour){
                case "1":
                    hour="13";
                    break;
                case "2":
                    hour="14";
                    break;
                case "3":
                    hour="15";
                    break;
                case "4":
                    hour="16";
                    break;
                case "5":
                    hour="17";
                    break;
                case "6":
                    hour="18";
                    break;
                case "7":
                    hour="19";
                    break;
                case "8":
                    hour="20";
                    break;
                case "9":
                    hour="21";
                    break;
                case "10":
                    hour="22";
                    break;
                case "11":
                    hour="23";
                    break;
                case "12":
                    hour="12";
                    break;
            }
            System.out.println(hour+result);
        }

    }

}

/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock,
and 12:00:00 on a 24-hour clock.

The timeConversion method should convert and print the given number (String argument)

Input: 07:05:45PM
Output: 19:05:45

Input: 07:15:55AM
Output: 07:15:55
 */