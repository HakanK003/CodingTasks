package commonInterviewTasks.tasksFromYK;

import java.util.LinkedHashMap;
import java.util.Map;

public class SameChars {

    public static void main(String[] args) {
        System.out.println(same("abbcca", "cab"));
    }

    private static boolean same(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        Map<String, Integer> map1 = new LinkedHashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>();

        for (String s : arr1) {
            if(!map1.containsKey(s)){
                map1.put(s,1);
            }else {
                map1.put(s,map1.get(s)+1);
            }
        }
        for (String s : arr2) {
            if(!map2.containsKey(s)){
                map2.put(s,1);
            }else {
                map2.put(s,map2.get(s)+1);
            }
        }

        return map1.keySet().equals(map2.keySet());

    }

}
