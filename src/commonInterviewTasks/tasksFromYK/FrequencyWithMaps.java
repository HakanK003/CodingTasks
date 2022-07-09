package commonInterviewTasks.tasksFromYK;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyWithMaps {

    public static void main(String[] args) {
        String str = "google";
        frequency(str);
    }

    static void frequency(String str){
        String[] arr=str.split("");
        Map<String, Integer> map = new TreeMap<>();
        for (String s : arr) {
            if(!map.containsKey(s)){
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }
        map.forEach((k,v)->{
            System.out.println(k + " occures " + v + " times...");
        });
    }

}
