package fromLeetCode.problems_Java.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Related Topics
    -> Hash Table
    -> String
    -> Backtracking

    Problem
    -> https://leetcode.com/problems/letter-combinations-of-a-phone-number/

        Given a string containing digits from 2-9 inclusive,
        return all possible letter combinations that the number could represent. Return the answer in any order.
        A mapping of digits to letters (just like on the telephone buttons) is given below.
        Note that 1 does not map to any letters.

    Examples
    -> Example 1
            Input: digits = "23"
            Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    -> Example 2
            Input: digits = ""
            Output: []
    -> Example 3
            Input: digits = "2"
            Output: ["a","b","c"]

    Constraints
    -> 0 <= digits.length <= 4
    -> digits[i] is a digit in the range ['2', '9'].
 */


/**
 * Approach 1 ->
 *
 *
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime 1 ms Beats 93.41% | Memory 40.8 MB Beats 94.31%
 */
class Solution0017_1 {
    public List<String> letterCombinations(String digits) {

        ArrayList<String> result = new ArrayList<>();
        String[][] letters = { {""}, {""}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};
        for (int i = 0; i < digits.length(); i++) {
            int index = digits.charAt(i)-48;
            if (result.size()>0){
                ArrayList<String> temp = new ArrayList<>();
                for (int j = 0; j < result.size(); j++) {
                    for (int k = 0; k < letters[index].length; k++) {
                        temp.add(result.get(j)+letters[index][k]);
                    }
                }
                result = temp;
            }else{
                result.addAll(Arrays.asList(letters[index]));
            }

        }

        return result;
    }
}