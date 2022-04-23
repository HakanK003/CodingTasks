package fromCodingBat.map1_Solutions;

import java.util.Map;

public class MapAB4 {

    public Map<String, String> mapAB4 (Map<String, String > map){

        if (map.containsKey("a")&&map.containsKey("b")){

            String valueA = "", valueB = "";

            for ( Map.Entry<String, String> eachPairs : map.entrySet()){

                if (eachPairs.getKey().equals("a")){
                    valueA=eachPairs.getValue();
                }
                if (eachPairs.getKey().equals("b")) {
                    valueB = eachPairs.getValue();
                }

            }

            String longer = (valueA.length()>valueB.length())? valueA :(valueA.length()<valueB.length())? valueB : "" ;

            if (longer.equals("")){

                for ( Map.Entry<String, String> eachPairs : map.entrySet()){

                    if (eachPairs.getKey().equals("a")){
                        eachPairs.setValue("");
                    }
                    if (eachPairs.getKey().equals("b")) {
                        eachPairs.setValue("");
                    }

                }

            }else{
                map.put("c", longer);
            }

        }

        return map;

    }

}

/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */