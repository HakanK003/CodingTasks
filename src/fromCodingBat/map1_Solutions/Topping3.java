package fromCodingBat.map1_Solutions;

import java.util.Map;

public class Topping3 {

    public Map<String, String> topping3(Map<String, String> map) {

        String temp1="";
        String temp2="";

        for (Map.Entry<String, String > eachPairs : map.entrySet()){

            if (eachPairs.getKey().equals("potato")){
                temp2=eachPairs.getValue();
            }

            if (eachPairs.getKey().equals("salad")){
                temp1= eachPairs.getValue();
            }

        }

        if (!temp1.isEmpty()){

            map.put("spinach", temp1);

        }

        if (!temp2.isEmpty()){

            map.put("fries", temp2);

        }

        return map;

    }

}

/*
Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value,
set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".

topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 */