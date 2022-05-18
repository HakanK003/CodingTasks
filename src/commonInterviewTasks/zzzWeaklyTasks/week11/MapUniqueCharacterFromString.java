package commonInterviewTasks.zzzWeaklyTasks.week11;

import java.util.HashMap;
import java.util.Map;

public class MapUniqueCharacterFromString {

    public static void main(String[] args) {

        System.out.println("uniquesMap(\"abbcccddeffggghhi\") = " + uniquesMap("abbcccddeffggghhi"));

    }

    public static Map<String, Integer> uniquesMap(String str){

        Map<String, Integer> uniques = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            int count =0;

            if (!uniques.containsKey(str.charAt(i)+"")){

                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i)==str.charAt(j)){
                        count++;
                    }

                }

                if (count==1){

                    uniques.put(str.charAt(i)+"", 1);

                }

            }


        }

        return uniques;

    }

}
