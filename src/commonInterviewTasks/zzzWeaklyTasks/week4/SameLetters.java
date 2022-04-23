package commonInterviewTasks.zzzWeaklyTasks.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {

    public static void main(String[] args) {

        String str1 = "Hello There";
        String str2 = "Hello There";

        System.out.println( containsSameLetters(str1, str2) );

        String str3 = "Hello There";
        String str4 = "Hello Ther";

        System.out.println( containsSameLetters(str3, str4) );

        String str5 = "abc";
        String str6 = "cab";

        System.out.println( containsSameLetters(str5, str6) );


//        String str1 = "Hello There";
//        String str2 = "Hello There";
//
//        System.out.println( containsSameLetters2(str1, str2) );
//
//        String str3 = "Hello There";
//        String str4 = "Hello Ther";
//
//        System.out.println( containsSameLetters2(str3, str4) );
//
//        String str5 = "abc";
//        String str6 = "cab";
//
//        System.out.println( containsSameLetters2(str5, str6) );


    }

    public static boolean containsSameLetters(String str1, String str2){


        List <String> word1Letters = new ArrayList<>( Arrays.asList( str1.split("") ) );
        List <String> word2Letters = new ArrayList<>( Arrays.asList( str2.split("") ) );

        Collections.sort(word1Letters);
        Collections.sort(word2Letters);

        return  word1Letters.equals(word2Letters);

    }


    public static boolean containsSameLetters2(String str1, String str2){

        String[] str1Letters = str1.split("");
        String[] str2Letters = str2.split("");

        for (int i =0; i<str1Letters.length; i++) {

            for (int j =0; j<str2Letters.length; j++) {

                if (str1Letters[i].equals(str2Letters[j])){

                    str1Letters[i]=null;
                    str2Letters[j]=null;
                    break;

                }

            }

        }

        return Arrays.equals(str1Letters, str2Letters);
    }

}

/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */