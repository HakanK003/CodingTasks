package commonInterviewTasks.tasksFromYK;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstSingleChar {

    public static void main(String[] args) {
        System.out.println(findFirstSingleChar("google"));
    }

    static String findFirstSingleChar(String str){
        String result = "There is no unique character";
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String s : str.split("")){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s, (map.get(s)+1));
            }
        }

        for(Map.Entry<String, Integer> each : map.entrySet()){
            if(each.getValue()==1){
                result = each.getKey();
                break;
            }
        }
        return result;
    }

}
