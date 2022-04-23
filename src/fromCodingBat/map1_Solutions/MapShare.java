package fromCodingBat.map1_Solutions;

import java.util.Map;

public class MapShare {

    public Map<String, String> mapShare(Map<String, String> map) {

        String temp="";

        if (map.containsKey("c")){
            map.remove("c");
        }

        for (Map.Entry<String, String> eachPair : map.entrySet())

            if (eachPair.getKey().equals("a") && map.containsKey("a")){

                temp = eachPair.getValue();

            }

        if( map.containsKey("a")){
            map.put("b", temp);}

        return map;


    }

}

/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */