package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Backtracking
    -> Array
    -> Matrix

    Problem
    -> https://leetcode.com/problems/word-search/

        Given an m x n grid of characters board and a string word, return true if word exists in the grid.
        The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally
        or vertically neighboring. The same letter cell may not be used more than once.

    Examples
    -> Example 1
            Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
            Output: true
    -> Example 2
            Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
            Output: true
    -> Example 3
            Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
            Output: false

    Constraints
    -> m == board.length
    -> n = board[i].length
    -> 1 <= m, n <= 6
    -> 1 <= word.length <= 15
    -> board and word consists of only lowercase and uppercase English letters

    Notes
    * Follow up: Could you use search pruning to make your solution faster with a larger board?
 */


/**
 * Approach 1 ->
 *
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result

 *
 * Reference
 *   https://leetcode.com/problems/word-search/discuss/27658/Accepted-very-short-Java-solution.-No-additional-space.
 */
class Solution0079 {
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        for (int y=0; y<board.length; y++) {
            for (int x=0; x<board[y].length; x++) {
                if (exist(board, y, x, w, 0)) return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int y, int x, char[] word, int i) {
        if (i == word.length) return true;
        if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
        if (board[y][x] != word[i]) return false;
        board[y][x] ^= 256;
        boolean exist = exist(board, y, x+1, word, i+1)
                || exist(board, y, x-1, word, i+1)
                || exist(board, y+1, x, word, i+1)
                || exist(board, y-1, x, word, i+1);
        board[y][x] ^= 256;
        return exist;
    }
}
