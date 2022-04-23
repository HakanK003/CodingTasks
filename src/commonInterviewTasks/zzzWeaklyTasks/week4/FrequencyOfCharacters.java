package commonInterviewTasks.zzzWeaklyTasks.week4;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDD";

        frequencyOfChars(str);


        frequencyOfChars2(str);


        frequencyOfChars3(str);





    }

    public static void frequencyOfChars(String str){

        String[] letters = str.split("");

        List<String> lettersList = new ArrayList<>( Arrays.asList( letters ) );

        Set <String> lettersSet = new HashSet<>(Arrays.asList( letters ) );

        str="";

        for (String each : lettersSet) {
            str+= each + Collections.frequency( lettersList, each );
        }

        System.out.println( str );

    }


    public static void frequencyOfChars2(String str){

        String[] letters = str.split("");

        str="";

        for (String each : letters) {

            if ( !str.contains(each) ){

                str+=each;

                int count=0;

                for (String checker : letters) {

                    if(each.equals(checker)){count++;}

                }

                str+=count;

            }

        }

        System.out.println(str);

    }


    public static void frequencyOfChars3(String str){

        String[] letters = str.split("");

        String result = "";

        for (int i = 0; i < letters.length; i++){


            String currentLetter = letters[i];

            if ( !result.contains( currentLetter ) ){


                result+=currentLetter;


                int count = 0;


                for (int j = 0; j < letters.length; j++){



                    if (currentLetter.equals( letters[j] )){

                        count++;

                    }

                }

                result+=count;

            }

        }

        System.out.println("result = "+ result);

    }


}

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */