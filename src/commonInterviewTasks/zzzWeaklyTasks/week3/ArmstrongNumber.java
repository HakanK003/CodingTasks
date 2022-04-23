package commonInterviewTasks.zzzWeaklyTasks.week3;

import java.util.ArrayList;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println("153 "+isArmstrong(153)); // (1*1*1)+(5*5*5)+(3*3*3) = 153
                                                 //    1   +  125  +   27  =   153  true

        System.out.println("3 "+isArmstrong(3));   //  3   =  3
                                                //    3    =  3       true

        System.out.println("23 "+isArmstrong(23)); //  (2*2) + (3*3) != 23  false
                                                //    4 +   9   = 13

        System.out.println("1634 "+isArmstrong(1634));


        System.out.println("6 "+isArmstrong(6));


        System.out.println("222 "+isArmstrong(222));


        System.out.println("371 "+isArmstrong(371));


        System.out.println("9474 "+isArmstrong(9474));


        System.out.println("2222 "+isArmstrong(2222));


    }

    public static boolean isArmstrong(int a){

        ArrayList<Integer> digits = new ArrayList<>();

        int num = a;
        int result =0;

        while(a>=1){


            int digit=a%10;

            a = a/10;

            digits.add(digit);

        }



        for (Integer each : digits) {

            int temp=1;

            for (int j = 0; j < digits.size(); j++) {
                temp *= each;
            }

            result = result + temp;

        }

      return num==result;
    }


}

/*
Write a method that can check if a number is Armstrong or not
 */

/*

  int result = 0;

        int b = a;

        int c = a;

        int i = 1;

        while(a>=10){
            a=a/10;
            i++;
        }

        for (int j = i; j >= i; j--) {


            for (int k = 1; k < j; k++) {

                b=b/10;

            }

            int d = b;

            for (int m = 1; m < i; m++) {
                b*=d;
            }

            result+=b;

        }

    return c==result;

 */