package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Hash Table
    -> String
    -> Queue
    -> Counting

    Problem
    -> https://leetcode.com/problems/detect-capital/

        We define the usage of capitals in a word to be right when one of the following cases holds:
        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital, like "Google".
        Given a string word, return true if the usage of capitals in it is right.



    Examples
    -> Example 1
            Input: word = "USA"
            Output: true
    -> Example 2
            Input: word = "FlaG"
            Output: false

    Constraints
    -> 1 <= word.length <= 100
    -> word consists of lowercase and uppercase English letters.
 */



/**
 * Approach 1 ->
 *
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime
 * 2 ms
 * Beats
 * 68.96%
 * Memory
 * 42.7 MB
 * Beats
 * 27.37%
 */
class Solution0520_1 {
    public boolean detectCapitalUse(String word) {

        if (word.length() == 1) return true;

        boolean firstCapital = word.charAt(0) < 91 && word.charAt(0) > 64;
        boolean secondCapital = word.charAt(0) < 91 && word.charAt(0) > 64;

        if (!firstCapital && secondCapital) return false;
        else if (firstCapital && secondCapital) {
            for (int i = 2; i < word.length(); i++)
                if (!(word.charAt(i) < 91 && word.charAt(i) > 64)) return false;
        }else{
            for (int i = 2; i < word.length(); i++)
                if (!(word.charAt(i) < 123 && word.charAt(i) > 96)) return false;
        }
        return true;

    }
}

class Solution0520_2 {
    public boolean detectCapitalUse(String word) {

        boolean firstCapital = word.charAt(0) < 91 && word.charAt(0) > 64;

        for (int i = 1; i < word.length(); i++) {

        }

        return true;
    }
}