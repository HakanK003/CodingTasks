package fromCodingBat.map2_Solutions;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            int count=0;

            for (int j = 0; j < strings.length; j++) {

                if (strings[i].equals(strings[j])){count++;}

            }

            arrMap.put(strings[i], count);

        }

        return arrMap;

    }

}

/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string,
with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */