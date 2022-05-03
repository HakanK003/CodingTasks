package commonInterviewTasks.someTasks.array_tasks;

import java.util.HashMap;
import java.util.Map;

public class Array_FrequencyOfEachElement_WithWord {

    /*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};
     write a program that should count each number and prints a sentence to say how many times a number is repeated example:
     (if it is more than ten print "more than ten")
        1 is two,
        3 is three,
        4 is two.
        2 is five
     */


    public static void main(String[] args) {

        printFrequency( new  int[] {1,2,3,4,3,2,1,3,2,2,2,4});


    }

    public static void printFrequency(int[] numbers){

        Map<Integer, String> frequencyPairs = new HashMap<>();

        String[] frequencyWords = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};

        for (int each : numbers) {

            if (frequencyPairs.containsKey(each)) continue;

            int frequency=0;

            for (int number : numbers) {

                if (each==number) frequency++;

            }

            frequencyPairs.put(each, (frequency<10)? frequencyWords[frequency-1] : frequencyWords[10]);

        }

        //System.out.println(frequencyPairs);

        frequencyPairs.forEach( (k,v) -> System.out.println(k+" is "+v) );

    }


}
