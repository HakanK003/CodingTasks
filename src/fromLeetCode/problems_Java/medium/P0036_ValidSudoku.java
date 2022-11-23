package fromLeetCode.problems_Java.medium;

import java.util.HashSet;
import java.util.Set;

/*
    Related Topics
    -> Hash Table
    -> Array
    -> Matrix

    Problem
    -> https://leetcode.com/problems/valid-sudoku/

        Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
            Each row must contain the digits 1-9 without repetition.
            Each column must contain the digits 1-9 without repetition.
            Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
        Note
            A Sudoku board (partially filled) could be valid but is not necessarily solvable.
            Only the filled cells need to be validated according to the mentioned rules.

    Examples
    -> Example 1
            Input: board =
                [["5","3",".",".","7",".",".",".","."]
                ,["6",".",".","1","9","5",".",".","."]
                ,[".","9","8",".",".",".",".","6","."]
                ,["8",".",".",".","6",".",".",".","3"]
                ,["4",".",".","8",".","3",".",".","1"]
                ,["7",".",".",".","2",".",".",".","6"]
                ,[".","6",".",".",".",".","2","8","."]
                ,[".",".",".","4","1","9",".",".","5"]
                ,[".",".",".",".","8",".",".","7","9"]]
            Output: true
    -> Example 2
        Input: board =
            [["8","3",".",".","7",".",".",".","."]
            ,["6",".",".","1","9","5",".",".","."]
            ,[".","9","8",".",".",".",".","6","."]
            ,["8",".",".",".","6",".",".",".","3"]
            ,["4",".",".","8",".","3",".",".","1"]
            ,["7",".",".",".","2",".",".",".","6"]
            ,[".","6",".",".",".",".","2","8","."]
            ,[".",".",".","4","1","9",".",".","5"]
            ,[".",".",".",".","8",".",".","7","9"]]
        Output: false
        Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.

    Constraints
    -> board.length == 9
    -> board[i].length == 9
    -> board[i][j] is a digit 1-9 or '.'
 */



/**
 * Approach 1 ->
 *
 *   Loop trough String and add chars to LinkedList. If List already contains char, remove elements till char gone.
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime: 16 ms, faster than 37.09% of Java online submissions for Valid Sudoku.
 *   Memory Usage: 42.7 MB, less than 87.14% of Java online submissions for Valid Sudoku.
 *
 * Reference
 *   https://leetcode.com/problems/valid-sudoku/discuss/15472/Short%2BSimple-Java-using-Strings
 */
class Solution0036 {
    public boolean isValidSudoku(char[][] board) {

        Set seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }
}
