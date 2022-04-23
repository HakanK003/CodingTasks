package fromCodingBat.map1_Solutions;

import java.util.Map;

public class Topping2 {

    public Map<String, String> topping2(Map<String, String> map) {

        String tempIceCream="";

        for(Map.Entry<String, String> eachPairs : map.entrySet()){

            if (eachPairs.getKey().equals("ice cream")){
                tempIceCream+=eachPairs.getValue();
            }

            if (eachPairs.getKey().equals("spinach")){
                eachPairs.setValue("nuts");
            }

        }

        if (!tempIceCream.isEmpty()){
            map.put("yogurt", tempIceCream);
        }

        return map;

    }

}

/*
Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value,
set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */