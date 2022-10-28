package fromLeetCode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/*
    Related Topics
    -> Array
    -> Hash Table
    -> String
    -> Sorting
 */

public class GroupAnagrams_49 {

    //Runtime: 131 ms, faster than 5.57% of Java online submissions for Group Anagrams.
    //Memory Usage: 71.4 MB, less than 6.62% of Java online submissions for Group Anagrams.
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<TreeMap<Character, Integer>, List<String>> template = new HashMap<>();

        for (String str : strs) {

            TreeMap<Character, Integer> counts = new TreeMap<>();

            for (int j = 0; j < str.length(); j++) {

                char current = str.charAt(j);

                if (counts.containsKey(current)) {
                    counts.put(current, counts.get(current) + 1);
                } else {
                    counts.put(current, 1);
                }

            }

            if (template.containsKey(counts)){
                List<String> newList = template.get(counts);
                newList.add(str);
                template.put(counts,newList);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                template.put(counts,newList);
            }

        }

        return new ArrayList<>(template.values());
    }

}
