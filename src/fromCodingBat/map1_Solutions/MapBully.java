package fromCodingBat.map1_Solutions;

import java.util.Map;

public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {

        String temp="";

        for (Map.Entry<String, String> eachPair : map.entrySet()){

            if (eachPair.getKey().equals("a")){

                temp = eachPair.getValue();
                eachPair.setValue("");

            }

            if (eachPair.getKey().equals("b") && (map.containsKey("a")) ){

                eachPair.setValue(temp);

            }

        }

        if((map.containsKey("a"))&& !((map.containsKey("b")))){

            map.put("b", temp);

        }
        return map;

    }

}

/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */