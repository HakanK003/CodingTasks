package fromLeetCode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        int start=0, end=0, result=0;

        ArrayList<Character> chars = new ArrayList<>();

        for(;end<s.length(); ){

            if(chars.contains(s.charAt(end))){

                end++;
                start=end;
                result= (end-start>result)? end-start : result;
                chars.clear();


            }else{

                chars.add(s.charAt(end));
                end++;
                result= (end-start>result)? end-start : result;

            }

        }

        return result;

    }


    public int lengthOfLongestSubstring2(String s) {

        int start=0, end=0, result=0;

        ArrayList<Character> chars = new ArrayList<>();

        for(;end<s.length(); ){

            if(chars.contains(s.charAt(end))){

                end++;
                result= Math.max(end - start, result);
                start=end;
                chars.clear();


            }else{

                chars.add(s.charAt(end));
                end++;
                result= Math.max(end - start, result);

            }

        }

        return result;

    }


    public int lengthOfLongestSubstring3(String s) {

        LinkedList<Character> chars = new LinkedList<>();

        for(int i = 0; i<s.length(); i++){

            if(chars.contains(s.charAt(i))){

                while(chars.contains(s.charAt(i))){
                    chars.pop();
                }
                chars.add(s.charAt(i));


            }else{

                chars.add(s.charAt(i));

            }

        }

        return chars.size();

    }

    //Runtime: 42 ms, faster than 17.92% of Java online submissions for Longest Substring Without Repeating Characters.
    //Memory Usage: 45 MB, less than 48.61% of Java online submissions for Longest Substring Without Repeating Characters.
    public int lengthOfLongestSubstring4(String s) {

        int result = 0;

        LinkedList<Character> chars = new LinkedList<>();

        for(int i = 0; i<s.length(); i++){

            if(chars.contains(s.charAt(i))){

                while(chars.contains(s.charAt(i))){
                    chars.pop();
                }
                chars.add(s.charAt(i));
                result= (chars.size()>result)? chars.size() : result;


            }else{

                chars.add(s.charAt(i));
                result= (chars.size()>result)? chars.size() : result;

            }

        }

        return result;

    }

    //Runtime: 52 ms, faster than 16.89% of Java online submissions for Longest Substring Without Repeating Characters.
    //Memory Usage: 44.5 MB, less than 63.98% of Java online submissions for Longest Substring Without Repeating Characters.
    public int lengthOfLongestSubstring4_2(String s) {

        int result = 0;

        LinkedList<Character> chars = new LinkedList<>();

        for(int i = 0; i<s.length(); i++){

            if(chars.contains(s.charAt(i))){

                while(chars.contains(s.charAt(i))){
                    chars.pop();
                }
                chars.add(s.charAt(i));
                result= Math.max(chars.size(), result);

                if (result>chars.size()+(s.length()-i)) break;


            }else{

                chars.add(s.charAt(i));
                result= Math.max(chars.size(), result);

            }

        }

        return result;

    }

    //Runtime: 52 ms, faster than 16.89% of Java online submissions for Longest Substring Without Repeating Characters.
    //Memory Usage: 45.2 MB, less than 44.89% of Java online submissions for Longest Substring Without Repeating Characters.
    public int lengthOfLongestSubstring4_4(String s) {

        if (s == null || s.length() == 0) return 0;

        int result = 0;

        LinkedList<Character> chars = new LinkedList<>();

        for(int i = 0; i<s.length(); i++){

            if(chars.contains(s.charAt(i))){

                while(chars.contains(s.charAt(i))){
                    chars.pop();
                }

            }
            chars.add(s.charAt(i));
            result= Math.max(chars.size(), result);

            if (result>chars.size()+(s.length()-i))  return result;


        }

        return result;
    }


    /**
     * Approach 1: Sliding Window
     * Using Sliding Window Template
     * Detail explanation about the template is here:
     *  https://github.com/cherryljr/LeetCode/blob/master/Sliding%20Window%20Template.java
     */

        //
        public int lengthOfLongestSubstring6(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }

            Map<Character, Integer> map = new HashMap<>();
            int ans = 0;
            int counter = 0;
            for (int left = 0, right = 0; right < s.length(); right++) {
                // count > 0 means repeating character
                char cRight = s.charAt(right);
                map.put(cRight, map.getOrDefault(cRight, 0) + 1);
                if (map.get(cRight) > 1) {
                    counter++;
                }

                while (counter > 0) {
                    char cLeft = s.charAt(left);
                    map.put(cLeft, map.get(cLeft) - 1);
                    // map.get(cLeft) == 1 means the cLeft is the duplicated character,
                    // and we have remove it, so after left++, it will be distinct.
                    if (map.get(cLeft) == 1) {
                        counter--;
                    }
                    left++;
                }
                ans = Math.max(ans, right - left + 1);
            }

            return ans;
        }


    /**
     * Approach 2: Sliding Window (Optimized)
     * The above solution requires at most 2n steps.
     * In fact, it could be optimized to require only n steps.
     * We could define a mapping of the characters to its index.
     * Then we can skip the characters immediately when we found a repeated character.
     *
     * The reason is that if s[j] have a duplicate in the range [i, j)with index j',
     * we don't need to increase i little by little. We can skip all the elements in the range [i, j']
     * and let i to be j' + 1 directly.
     *
     * Complexity Analysis
     * Time complexity : O(n). Index j will iterate n times.
     * Space complexity : O(min(m, n)). Same as the previous approach.
     */

        //Runtime: 9 ms, faster than 74.21% of Java online submissions for Longest Substring Without Repeating Characters.
        //Memory Usage: 44.8 MB, less than 54.09% of Java online submissions for Longest Substring Without Repeating Characters.
        public int lengthOfLongestSubstring7(String s) {
            int n = s.length(), ans = 0;
            // current index of character
            Map<Character, Integer> map = new HashMap<>();
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return ans;
        }


}
