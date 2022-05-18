package commonInterviewTasks.zzzWeaklyTasks.week11;

import java.util.HashMap;
import java.util.Map;

public class MapMinValue {

    public static void main(String[] args) {

        Map<String, Integer> aMap = new HashMap<>();
        aMap.put("A", 8);
        aMap.put("B", 7);
        aMap.put("C", 6);
        aMap.put("D", 50);
        aMap.put("E", 40);
        aMap.put("F", 30);
        aMap.put("G", 20);
        aMap.put("H", 10);

        minValueMap(aMap);

    }

    public static void minValueMap(Map<String, Integer> map){

        int min = Integer.MAX_VALUE;

        Map.Entry<String, Integer> minPair = null;

        for (Map.Entry<String, Integer> eachPair : map.entrySet()){

            if (min > eachPair.getValue()){

                minPair = eachPair;
                min = eachPair.getValue();

            }

        }

        System.out.println("minPair = "+minPair + " -> minValue = " + min);
    }

}
