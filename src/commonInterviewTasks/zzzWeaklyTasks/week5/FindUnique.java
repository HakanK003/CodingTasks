package commonInterviewTasks.zzzWeaklyTasks.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindUnique {

    public static void main(String[] args) {

//        String str1 = "AAABBBCCCDEF";
//
//        System.out.println("findUniques(str1) = " + findUniques(str1));
//
//        String str2 = "Hello There";
//
//        System.out.println("findUniques(str2) = " + findUniques(str2));
//
//        String str3 = "Java";
//
//        System.out.println("findUniques(str3) = " + findUniques(str3));



        String str4 = "AAABBBCCCDEF";

        System.out.println("findUniques2(str1) = " + findUniques2(str4));

        String str5 = "Hello There";

        System.out.println("findUniques2(str2) = " + findUniques2(str5));

        String str6 = "Java";

        System.out.println("findUniques2(str3) = " + findUniques2(str6));



    }

    public static String findUniques(String str){

        String result = "";

        ArrayList<String> letters = new ArrayList<>( Arrays.asList( str.split("") ) );

        for (String each : letters) {

            if ( Collections.frequency(letters, each)==1 ){result+=each;}

        }

       return result;

    }


    public static String findUniques2(String str){

        String result = "";

        char[] letters = str.toCharArray();

        for (char each : letters) {

            int count = 0;

            for (char checker : letters) {

                if (each==checker){count++;}

            }

            if (count==1){result+=each;}

        }

        return result;

    }


}

/*
String -- Find the unique
Write a return method that can find the unique characters
from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */