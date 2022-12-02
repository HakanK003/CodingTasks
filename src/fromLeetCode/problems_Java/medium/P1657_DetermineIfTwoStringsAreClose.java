package fromLeetCode.problems_Java.medium;

import java.util.Arrays;

/*
    Related Topics
    -> String
    -> Hash Table
    -> Sorting

    Problem
    -> https://leetcode.com/problems/determine-if-two-strings-are-close/

        Two strings are considered close if you can attain one from the other using the following operations:
        Operation 1: Swap any two existing characters.
            For example, abcde -> aecdb
        Operation 2: Transform every occurrence of one existing character into another existing character,
        and do the same with the other character.
            For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
        You can use the operations on either string as many times as necessary.
        Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

    Examples
    -> Example 1
            Input: word1 = "abc", word2 = "bca"
            Output: true
            Explanation: You can attain word2 from word1 in 2 operations.
            Apply Operation 1: "abc" -> "acb"
            Apply Operation 1: "acb" -> "bca"
    -> Example 2
            Input: word1 = "a", word2 = "aa"
            Output: false
            Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
    -> Example 3
            Input: word1 = "cabbba", word2 = "abbccc"
            Output: true
            Explanation: You can attain word2 from word1 in 3 operations.
            Apply Operation 1: "cabbba" -> "caabbb"
            Apply Operation 2: "caabbb" -> "baaccc"
            Apply Operation 2: "baaccc" -> "abbccc"


    Constraints
    -> 1 <= word1.length, word2.length <= 10^5
    -> word1 and word2 contain only lowercase English letters
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
 *   Runtime: 74 ms, faster than 41.33% of Java online submissions for Determine if Two Strings Are Close.
 *   Memory Usage: 54.7 MB, less than 61.78% of Java online submissions for Determine if Two Strings Are Close.
 *
 * Reference
 *   https://leetcode.com/problems/determine-if-two-strings-are-close/discuss/1590058/Simple-java-solution-O(n)
 *
 */
class Solution1657_1 {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;

        //create frequency map for corresponding words
        int[] freqMap1 = new int[26];
        int[] freqMap2 = new int[26];

        //fill the maps with values
        word1.chars().forEach(i->freqMap1[i - 97]++);
        word2.chars().forEach(i->freqMap2[i - 97]++);

        //check if there exists a character that exisit in one word and does not exist in the other word
        for(int i = 0 ; i < 26 ; i++)
            if(freqMap1[i] != 0 || freqMap2[i] != 0)
                if(freqMap1[i] == 0 || freqMap2[i] == 0)
                    return false;

        //sort both maps to compare values
        Arrays.sort(freqMap1);
        Arrays.sort(freqMap2);

        //check if any value is different
        for(int i = 0 ; i < 26 ; i++)
            if(freqMap1[i] != freqMap2[i])
                return false;

        return true;
    }
}


//sample 43000 KB submission && sample 11 ms submission
//class Solution {
//    public boolean closeStrings(String s1, String s2) {
//
//        var freqs1 = new int[26];
//        for(var c1: s1.toCharArray()) {
//            freqs1[c1 - 'a']++;
//        }
//        var freqs2 = new int[26];
//        for(var c2: s2.toCharArray()) {
//            freqs2[c2 - 'a']++;
//        }
//        for(int i = 0; i < 26; i++) {
//            if(freqs1[i]  > 0 && freqs2[i] == 0) {
//                return false;
//            }
//            if(freqs1[i] == 0 && freqs2[i]  > 0) {
//                return false;
//            }
//        }
//        Arrays.sort(freqs1);
//        Arrays.sort(freqs2);
//        return Arrays.equals(freqs1, freqs2);
//    }
//}





