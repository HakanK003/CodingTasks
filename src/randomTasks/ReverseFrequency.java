package randomTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseFrequency {

    public static void main(String[] args) {

        String str ="AAAABBBCCD";

        System.out.println(reverseEverything(str));


    }

    public static String reverseEverything(String str){

        String result="";

        ArrayList<String> letters = new ArrayList<>( Arrays.asList(str.split("")) );

        ArrayList<String> lettersUnique = new ArrayList<>( Arrays.asList (Arrays.stream(str.split("")).distinct().toArray(String[]::new)) );

        for (int i =0, j= lettersUnique.size()-1; i< letters.size(); i++) {

            if (!result.contains(letters.get(i))) {
                result += letters.get(i).repeat((Collections.frequency(letters, lettersUnique.get(j))));

                j-=1;

            }
        }

        return result;

    }

}
