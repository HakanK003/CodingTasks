package fromCodingBat.map1_Solutions;

import java.util.Map;

public class Topping1 {

    public Map<String, String> topping1(Map<String, String> map) {

        for (Map.Entry<String,String> eachPair : map.entrySet()){

            if (eachPair.getKey().equals("ice cream")){
                eachPair.setValue("cherry");
            }

            if (map.containsKey("breed")&&eachPair.getKey().equals("breed")){
                eachPair.setValue("butter");
            }

        }

        if (!map.containsKey("breed")){
           map.put("breed", "butter");
        }

        return map;

    }

}

/*

Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present,
set its value to "cherry". In all cases, set the key "bread" to have the value "butter".

topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
 */