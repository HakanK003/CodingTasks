package commonInterviewTasks.tasksFromYK;

import java.util.*;

public class Lambda {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 1);
        map.put("c", 4);
        map.put("d", 3);

        map.get("a");

        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(Collections.max(map.values()));

        System.out.println("====Map with for each loop=====");
        int max1 = Integer.MIN_VALUE;
        String result1 = "";
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue() > max1) {
                max1 = each.getValue();
                result1 = each.getKey();
            }
        }
        System.out.println("result-1 = " + result1);

        System.out.println("====Map with lambda expression=====");
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("====Map with Iterator=====");

        Iterator<Map.Entry<String, Integer>> iter1 = map.entrySet().iterator();
        while (iter1.hasNext()) {
            Map.Entry<String, Integer> entry = iter1.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("=========Sorting Map by Value============");
        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        list.sort(Map.Entry.comparingByKey());
        map = new LinkedHashMap();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        System.out.println(map);

        System.out.println("=========ArrayList with Lambda Expression and for each============");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        nums.forEach(num -> System.out.println(num));

        // nums.forEach(System.out::println); ==>Exactly the same as above...

        System.out.println("=========ArrayList with Lambda Expression and for each remaining============");
        Iterator<Integer> iter2 = nums.iterator();
        iter2.forEachRemaining(num -> {
            System.out.println(num);
        });
        //iter2.forEachRemaining(System.out::println); the same as above

        System.out.println("=========ArrayList with while loop============");
        Iterator<Integer> iter3 = nums.iterator();
        while (iter3.hasNext()) {
            int num1 = iter3.next();
            System.out.println(num1);
        }
    }

}
