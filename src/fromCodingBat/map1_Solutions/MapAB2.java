package fromCodingBat.map1_Solutions;

import java.util.Map;

public class MapAB2 {

    public Map<String, String> mapAB2(Map<String, String> map) {

        if (map.containsKey("a")&&map.containsKey("b")){

            String tempA ="", tempB="";

            for (Map.Entry<String, String > eachPairs : map.entrySet()){

                if (eachPairs.getKey().equals("a")){
                    tempA=eachPairs.getValue();
                }

                if (eachPairs.getKey().equals("b")){
                    tempB=eachPairs.getValue();
                }

            }

            if (tempA.equals(tempB)){

                map.remove("a");
                map.remove("b");

            }

        }

        return map;

    }

}

/*
Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 */