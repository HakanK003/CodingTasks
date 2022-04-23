package commonInterviewTasks.zzzWeaklyTasks.week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCDEEFFF";

        System.out.println("Before --> " + str);

        System.out.println("After  --> " + removeDuplicates(str) );

        System.out.println("After  --> " + removeDuplicates2(str) );


    }

    public static String removeDuplicates(String str){

        Set <String> letterSet = new HashSet<>( Arrays.asList(str.split("") ) );

        str="";

        for (String each : letterSet) {
            str+=each;
        }

        return str;
    }


    public static String removeDuplicates2(String str){

        String[] letters = str.split("");

        str="";

        for (String each : letters) {

            if ( !str.contains(each) ) {

                str+=each;

            }

        }

        return str;
    }

}

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */