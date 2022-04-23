package fromCodingBat.map2_Solutions;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> arrMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            String str="";

            for (int j = 0; j < strings.length; j++) {

                if (strings[j].startsWith(strings[i].charAt(0)+"")){str+=strings[j];}

            }

            arrMap.put(strings[i].charAt(0)+"", str);

        }

        return arrMap;

    }

}

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */