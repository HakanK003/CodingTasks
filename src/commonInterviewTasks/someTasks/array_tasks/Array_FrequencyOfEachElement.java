package commonInterviewTasks.someTasks.array_tasks;

import java.util.*;

public class Array_FrequencyOfEachElement {


    /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static void main(String[] args) {


        String[] testArray = new String[]{"Apple", "Banana", "Apple", "Cherry", "Apple", "Cherry"};


        System.out.println(frequencyOfEach(testArray));


        // Solution 2 ( Combine List + Set )
            List<String> temp = Arrays.asList(testArray);
            for (String s : new HashSet<>(temp)) {
                System.out.println(s +"="+ Collections.frequency(temp, s) );
            }


        // Solution 3 ( Stream )
            Arrays.stream(testArray).distinct().forEach( e ->
                    System.out.println(e+"="+Arrays.stream(testArray).filter( p -> p.equals(e)).count() ));



    }


    public static Map<String, Integer> frequencyOfEach(String[] words){

        Map<String, Integer> eachFrequency = new HashMap<>();

        for (String word : words) {

            if (eachFrequency.containsKey(word)) continue;

            int frequency = 0;

            for (String s : words) {

                if (word.equals(s)) {
                    frequency++;
                }

            }

            eachFrequency.put(word, frequency);

        }

        return eachFrequency;

    }




}
