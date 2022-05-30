package commonInterviewTasks.tasksFromYK;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Anagram {

    public static void main(String[] args) {
        // https://leetcode.com/problems/valid-anagram/
        String str1 = "race";
        String str2 = "care";
        System.out.println("isAnagram1(str1, str2) = " + isAnagram1(str1, str2));
    }

    static boolean isAnagram1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.toString(ch1).equals(Arrays.toString(ch2));
    }






    static String toLowerCase(String str) {
        String lower = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (65 <= ch && ch <= 90) {
                ch = (char) ((ch + 32));
            }
            lower += ch;
        }
        return lower;
    }


    static boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (!map1.containsKey(ch1[i])) {
                map1.put(ch1[i], 1);
            } else {
                map1.put(ch1[i], map1.get(ch1[i]) + 1);
            }

            if (!map2.containsKey(ch2[i])) {
                map2.put(ch2[i], 1);
            } else {
                map2.put(ch2[i], map2.get(ch2[i]) + 1);
            }
        }
        return map1.equals(map2);
    }

}
