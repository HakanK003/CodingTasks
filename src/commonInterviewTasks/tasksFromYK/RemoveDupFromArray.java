package commonInterviewTasks.tasksFromYK;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RemoveDupFromArray {

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(remove(arr));
    }

    static List<Integer> remove(int[] arr){
        List<Integer> result=new ArrayList<>();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int each : arr) {
            if(!map.containsKey(each)){
                map.put(each,1);
            }else {
                map.put(each,map.get(each)+1);
            }
        }
        for (Map.Entry<Integer, Integer> each : map.entrySet()){
            if(each.getValue()==1){
                result.add(each.getKey());
            }
        }
        return result;
    }

}
