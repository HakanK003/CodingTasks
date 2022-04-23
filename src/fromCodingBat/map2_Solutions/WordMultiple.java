package fromCodingBat.map2_Solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> arrStr = new HashMap<>();

        for (String each : strings) {

            long a = Arrays.stream(strings).filter(x->x.equals(each)).count();

            if (a>1){
                arrStr.put(each, true);
            }else{
                arrStr.put(each, false);
            }

        }

        return arrStr;

    }

}

/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2
or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */