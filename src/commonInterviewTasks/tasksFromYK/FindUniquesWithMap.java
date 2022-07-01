package commonInterviewTasks.tasksFromYK;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindUniquesWithMap {

    public static void main(String[] args) {
        System.out.println(uniques("aaabcccdef"));
    }

    private static List<Character> uniques(String str) {
        List<Character> result = new ArrayList<>();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        map.forEach((k, v) -> {
            if (v == 1) {
                result.add(k);
            }
        });
        return result;
    }

}
