package commonInterviewTasks.zzzWeaklyTasks.week10;

import java.util.*;

public class MapSortTheMapByValues {

    public static void main(String[] args) {

        Map<String, Integer> sadfsdfsdaf = new HashMap<>();
        sadfsdfsdaf.put("a", 4);
        sadfsdfsdaf.put("b", 2);
        sadfsdfsdaf.put("c", 3);
        sadfsdfsdaf.put("d", 1);
        sadfsdfsdaf.put("e", 9);
        sadfsdfsdaf.put("f", 8);
        sadfsdfsdaf.put("g", 7);

        System.out.println(sortByValue(sadfsdfsdaf));


    }

    public static Map<String, Integer> sortMap (Map<String, Integer> map) throws Exception{

        Map<String, Integer> sortedMap = new LinkedHashMap<>();


        int min = Integer.MAX_VALUE;


        for (Map.Entry<String, Integer> eachPairFirst : map.entrySet()) {


            Map.Entry<String, Integer> minPair =  map.entrySet().iterator().next();


            for (Map.Entry<String, Integer> eachPair : map.entrySet()) {

                if (min > eachPair.getValue()) {

                    minPair = eachPair;
                    min = eachPair.getValue();

                }


                //if ( minPair != null ){
 //                   sortedMap.put(minPair);
                //}



            }

        }

        return map;

    }



    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }

}

