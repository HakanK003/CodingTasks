package fromCodingBat.map2_Solutions;

import java.util.HashMap;
import java.util.Map;

public class Pairs {

    public Map<String, String> pairs(String[] strings) {

        Map<String, String> arrMap = new HashMap<>();

        for (String each : strings) {

            arrMap.put(each.charAt(0)+"", each.charAt(each.length()-1)+"");

        }

        return arrMap;

    }

}

/*
Given an array of non-empty strings, create and return a Map<String, String> as follows:
for each string add its first character as a key with its last character as the value.

pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */