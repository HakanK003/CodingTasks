package fromCodingBat.map1_Solutions;

import java.util.Map;

public class MapAB {

    public Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")){

            String valueA="" , valueB ="";

            for (Map.Entry<String, String> eachPairs : map.entrySet()){

                if (eachPairs.getKey().equals("a")){
                    valueA = eachPairs.getValue();
                }

                if (eachPairs.getKey().equals("b")){
                    valueB = eachPairs.getValue();
                }

            }

            map.put("ab", valueA+valueB);

        }

        return map;
    }

}

/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
If both keys are present, append their 2 string values together and store the result under the key "ab".

mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */