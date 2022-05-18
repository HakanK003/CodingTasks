package commonInterviewTasks.zzzWeaklyTasks.week11;

import java.util.HashMap;
import java.util.Map;

public class MapFrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println("frequencyMap(\"abacbaeeedd\") = " + frequencyMap("abacbaeeedd"));

    }

    public static Map<String , Integer> frequencyMap (String str){

        Map<String, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            int count =0;

            if (!frequencies.containsKey(str.charAt(i)+"")){

            for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i)==str.charAt(j)){
                        count++;
                    }

                }

                frequencies.put(str.charAt(i)+"", count);

            }


        }

        return frequencies;

    }

}
