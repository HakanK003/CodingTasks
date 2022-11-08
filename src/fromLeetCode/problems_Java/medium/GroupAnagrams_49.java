package fromLeetCode.problems_Java.medium;

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

//TODO 6ms example solution
//
//class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//
//        List<List<String>> resList = new ArrayList<>();
//        Map<String, List<String>> map = new HashMap<>();
//
//        for(String str : strs){
//
//            char[] charString = str.toCharArray();
//            Arrays.sort(charString);
//            String charToString = new String(charString);
//            if(map.containsKey(charToString)){
//                map.get(charToString).add(str);
//            }else{
//                List<String> list = new ArrayList<>();
//                list.add(str);
//                map.put(charToString, list);
//            }
//        }
//
//        return new ArrayList<>(map.values());
//    }
//}

//TODO 44600kb example solution
//
//class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        HashMap<String, List<String>> hm = new HashMap<>();
//        for (int i = 0; i < strs.length; i++) {
//            char[] sorted = strs[i].toCharArray();
//            Arrays.sort(sorted);
//            String sortedSt = new String(sorted);
//            if (hm.containsKey(sortedSt)) {
//                List<String> value = hm.get(sortedSt);
//                value.add(strs[i]);
//                hm.put(sortedSt, value);
//            } else {
//                hm.put(sortedSt, new ArrayList<>(List.of(strs[i])));
//            }
//        }
//        List<List<String>> ans = new ArrayList<>(hm.values());
//        return ans;
//    }
//}