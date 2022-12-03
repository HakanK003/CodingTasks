package fromLeetCode.problems_Java.medium;

import java.util.HashMap;
import java.util.Map;

/*
    Related Topics
    -> String
    -> Hash Table
    -> Sorting
    -> Heap (Priority Queue)
    -> Bucket Sort
    -> Counting

    Problem
    -> https://leetcode.com/problems/sort-characters-by-frequency/

        Given a string s, sort it in decreasing order based on the frequency of the characters.
        The frequency of a character is the number of times it appears in the string.
        Return the sorted string. If there are multiple answers, return any of them.

    Examples
    -> Example 1
            Input: s = "tree"
            Output: "eert"
            Explanation: 'e' appears twice while 'r' and 't' both appear once.
            So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
    -> Example 2
            Input: s = "cccaaa"
            Output: "aaaccc"
            Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
                Note that "cacaca" is incorrect, as the same characters must be together.
    -> Example 3
            Input: s = "Aabb"
            Output: "bbAa"
            Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
            Note that 'A' and 'a' are treated as two different characters.

    Constraints
    -> 1 <= s.length <= 5 * 105
    -> s consists of uppercase and lowercase English letters and digits.
 */



/**
 * Approach 1 ->
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime: 37 ms, faster than 56.54% of Java online submissions for Sort Characters By Frequency.
 *   Memory Usage: 48.4 MB, less than 73.44% of Java online submissions for Sort Characters By Frequency.
 */
class Solution0451_1 {
    public String frequencySort(String s) {

        HashMap<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        while(!counts.isEmpty()){

            Map.Entry<Character,Integer> max = null;

            for (Map.Entry<Character,Integer> count : counts.entrySet()){
                if (max == null || count.getValue()> max.getValue()) max = count;
            }

            result.append(String.valueOf(max.getKey()).repeat(Math.max(0, max.getValue())));
            //or
            //            for (int i = 0; i < max.getValue(); i++) {
            //                result.append(max.getKey());
            //            }

            counts.remove(max.getKey());
        }

        return result.toString();
    }
}


//Also check other ways to do from
//https://leetcode.com/problems/sort-characters-by-frequency/discuss/93420/Java-O(n)-Bucket-Sort-Solution-O(nlogm)-PriorityQueue-Solution-easy-to-understand
