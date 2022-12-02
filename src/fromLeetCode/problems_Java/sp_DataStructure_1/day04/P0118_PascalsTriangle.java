package fromLeetCode.problems_Java.sp_DataStructure_1.day04;

import java.util.ArrayList;
import java.util.List;

/*
    Related Topics
    -> Array
    -> Dynamic Programming

    Problem
    -> https://leetcode.com/problems/pascals-triangle/?envType=study-plan&id=data-structure-i

        Given an integer numRows, return the first numRows of Pascal's triangle.
        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

    Examples
    -> Example 1
            Input: numRows = 5
            Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    -> Example 2
            Input: numRows = 1
            Output: [[1]]

    Constraints
    -> 1 <= numRows <= 30
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
 *   Runtime: 1 ms, faster than 80.32% of Java online submissions for Pascal's Triangle.
 *   Memory Usage: 41.6 MB, less than 70.07% of Java online submissions for Pascal's Triangle.
 */
class Solution0118_1 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> default1 = new ArrayList<>();
        default1.add(1);
        result.add(default1);
        if (numRows==1) return result;

        ArrayList<Integer> default2 = new ArrayList<>();
        default2.add(1);
        default2.add(1);
        result.add(default2);

        while(result.size()!=numRows){
            int currLastIndex = result.size() - 1;
            ArrayList<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int i = 0; i < result.get(currLastIndex).size() - 1; i++) {
                currRow.add(result.get(currLastIndex).get(i)+result.get(currLastIndex).get(i+1));
            }
            currRow.add(1);
            result.add(currRow);
        }

        return result;
    }
}

