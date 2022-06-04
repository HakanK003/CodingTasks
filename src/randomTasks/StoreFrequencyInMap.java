package randomTasks;

import java.util.HashMap;
import java.util.Map;

public class StoreFrequencyInMap {

    public static void main(String[] args) {

        String str = "aaabccccc";

        frequencyMap(str);

    }

    public static void frequencyMap(String str){

        Map<String, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            int count =0;

            if (!resultMap.containsKey(str.charAt(i)+"")) {

                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i) == str.charAt(j)) {

                        count++;

                    }

                }

                resultMap.put(str.charAt(i)+"", count);

            }

        }

        System.out.println(resultMap);

    }


    public static void frequencyMap2(String str){

        Map<Character, Integer> frequencies = new HashMap();

        for(int i =0; i<str.length(); i++){

            if(!frequencies.containsKey(str.charAt(i))){

                int count =0;

                for(int j=i; j<str.length(); j++){

                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                    }

                }

                frequencies.put(str.charAt(i), count);

            }

        }

        System.out.println(frequencies);

    }


}
