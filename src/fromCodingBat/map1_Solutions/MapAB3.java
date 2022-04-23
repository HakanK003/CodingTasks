package fromCodingBat.map1_Solutions;

import java.util.Map;

public class MapAB3 {

    public Map<String, String> mapAB3(Map<String, String> map) {

        boolean containsA = map.containsKey("a"), containsB = map.containsKey("b");

        if ((containsA&&!containsB)||(containsB&&!containsA)){

            String temp = "";

            for (Map.Entry <String, String> eachPairs : map.entrySet()){

                if (eachPairs.getKey().equals("a")||eachPairs.getKey().equals("b")){

                    temp=eachPairs.getValue();

                }

            }

            if (containsA){
                map.put("b", temp);
            }
            if (containsB){
                map.put("a", temp);
            }

        }

        return map;

    }

}

/*
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both),
set the other to have that same value in the map.

mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */