package commonInterviewTasks.zzzWeaklyTasks.week5;

import java.util.ArrayList;
import java.util.Collections;

public class SortLettersAndNumbers {

    public static void main(String[] args){


        String str1 ="DC501GCCCA098911";

        System.out.println("str1        = " + str1);
        System.out.println("sort1(str1) = " + sort1(str1));

        System.out.println("---------------------------------------------------");

        String str2 = "DC501GCCCA1A1122331B2";

        System.out.println("str2        = " + str2);
        System.out.println("sort1(str2) = " + sort1(str2));




    }


    public static String sort1(String str){

        String result="";


        int i =0;

        while(i<str.length()-1){


            ArrayList<String> part = new ArrayList<>();


            while(Character.isLetterOrDigit(str.charAt(i))){

                if (Character.isLetter((str.charAt(i)))){

                    part.add(""+str.charAt(i));

                    if (i==str.length()-1){break;}
                    else {i++;}


                    while(Character.isLetter(str.charAt(i))){

                        part.add(""+str.charAt(i));

                        if (i==str.length()-1){break;}
                        else {i++;}

                    }

                    break;

                }

                if (Character.isDigit(str.charAt(i))){

                    part.add(""+str.charAt(i));

                    if (i==str.length()-1){break;}
                    else {i++;}


                    while(Character.isDigit(str.charAt(i))){

                        part.add(""+str.charAt(i));

                        if (i==str.length()-1){break;}
                        else{i++;}

                    }

                    break;

                }


            }

            Collections.sort(part);

            for (String each : part) {

                result+=each;

            }


        }

        if (result.length()!=str.length()){result+=str.charAt(str.length()-1);}

        return result;

    }

}

/*
String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings
of consecutive letters or numbers, sort the individual string and
append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
 */