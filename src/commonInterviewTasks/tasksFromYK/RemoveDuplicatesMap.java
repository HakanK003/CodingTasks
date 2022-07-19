package commonInterviewTasks.tasksFromYK;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesMap {

    public static void main(String[] args) {
        String str = "aaabbbcccabcdef";
        System.out.println(freq(str));
    }

    private static Set<String> freq(String str) {
        String[] arr = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            if(!map.containsKey(s)){
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }
        return map.keySet();
    }

}
