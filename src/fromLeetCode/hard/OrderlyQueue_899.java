package fromLeetCode.hard;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/*
    Related Topics
    -> Math
    -> String
    -> Sorting
 */

public class OrderlyQueue_899 {

    public String orderlyQueue(String s, int k) {

        if (k == 1) {
            String ans = s;
            for (int i = 0; i < s.length(); ++i) {
                String temp = s.substring(i) + s.substring(0, i);
                if (temp.compareTo(ans) < 0) {
                    ans = temp;
                }
            }
            return ans;
        } else {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }



//    public String orderlyQueue(String s, int k) {
//
//        Queue<Character> fluid = new PriorityQueue<>();
//
//        for (int i = 0; i < k; i++) {
//
//            fluid.add(s.charAt(i));
//
//        }
//
//        s = s.replaceFirst(fluid.peek()+"", "") + fluid.poll();
//
//        return s;
//
//    }

}


//TODO 2ms and 40400kb example solution
//
//    public String orderlyQueue(String s, int k) {
//        if (k > 1) {
//            char[] ans = s.toCharArray();
//            Arrays.sort(ans);
//            return String.valueOf(ans);
//        }
//
//        char min = 'z';
//        ArrayList<Integer> charackterList = new ArrayList<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char cc = s.charAt(i);
//
//            if (cc < min) {
//                min = cc;
//            }
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == min) {
//                charackterList.add(i);
//            }
//        }
//
//        String result = s;
//        for (Integer integer : charackterList) {
//            String after = s.substring(0, integer);
//            String before = s.substring(integer);
//            String f = before + after;
//
//            if (f.compareTo(result) < 0) {
//                result = f;
//            }
//        }
//        return result;
//    }