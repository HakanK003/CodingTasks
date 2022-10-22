package fromLeetCode.hard;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring_76 {

    public String minWindow(String s, String t) {

        if ( s.length() < t.length() ) return "";

        String minWindow = "";

        int left =0;

        char[] letters = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

 //           if (s.substring(left, i))


        }


        return minWindow;

    }

}

//public String minWindow(String s, String t) {
//    int[] count = new int[128];
//    for (char c : t.toCharArray())
//        count[c]++;
//    String res = "";
//    int start = 0, end = 0, len = t.length(), min = s.length();
//    while (end < s.length()) {
//        if (count[s.charAt(end++)]-- > 0)   len--; // valid
//        while (len == 0) {
//            if (end - start <= min) { // update min & res
//                min = end - start;
//                res = s.substring(start, end);
//            }
//            if (count[s.charAt(start++)]++ == 0)    len++; // make invalid
//        }
//    }
//    return res;
//}



///    public String minWindow(String s, String t) {
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (char x : t.toCharArray()) {
//            map.put(x, map.getOrDefault(x, 0) + 1);
//        }
//
//        int matched = 0;
//        int start = 0;
//        int minLen = s.length() + 1;
//        int subStr = 0;
//        for (int endWindow = 0; endWindow < s.length(); endWindow++) {
//            char right = s.charAt(endWindow);
//            if (map.containsKey(right)) {
//                map.put(right, map.get(right) - 1);
//                if (map.get(right) == 0) matched++;
//            }
//
//            while (matched == map.size()) {
//                if (minLen > endWindow - start + 1) {
//                    minLen = endWindow - start + 1;
//                    subStr = start;
//                }
//                char deleted = s.charAt(start++);
//                if (map.containsKey(deleted)) {
//                    if (map.get(deleted) == 0) matched--;
//                    map.put(deleted, map.get(deleted) + 1);
//                }
//            }
//        }
//        return minLen > s.length() ? "" : s.substring(subStr, subStr + minLen);
//    }