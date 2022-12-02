package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Array
    -> Matrix
    -> Simulation

    Problem
    -> https://leetcode.com/problems/reshape-the-matrix/

        In MATLAB, there is a handy function called reshape which can reshape an m x n matrix
        into a new one with a different size r x c keeping its original data.
        You are given an m x n matrix mat and two integers r and c representing
        the number of rows and the number of columns of the wanted reshaped matrix.
        The reshaped matrix should be filled with all the elements of the original matrix
        in the same row-traversing order as they were.
        If the reshape operation with given parameters is possible and legal, output the new reshaped matrix;
        Otherwise, output the original matrix.

    Examples
    -> Example 1
            Input: mat = [[1,2],[3,4]], r = 1, c = 4
            Output: [[1,2,3,4]]
    -> Example 2
            Input: mat = [[1,2],[3,4]], r = 2, c = 4
            Output: [[1,2],[3,4]]

    Constraints
    -> m == mat.length
    -> n == mat[i].length
    -> 1 <= m, n <= 100
    -> -1000 <= mat[i][j] <= 1000
    -> 1 <= r, c <= 300
 */


/**
 * Approach 1 -> Nested for loop
 *
 *
 * Time Complexity -> O(n*m)
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime: 0 ms, faster than 100.00% of Java online submissions for Reshape the Matrix.
 *   Memory Usage: 43.5 MB, less than 82.38% of Java online submissions for Reshape the Matrix.
 */
class Solution0566_1 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (r*c!=mat[0].length* mat.length) return mat;

        int pointerRow =0 , pointerColumn=0;
        int[][] result = new int[r][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[pointerRow][pointerColumn]= mat[i][j];
                pointerColumn++;
                if (pointerColumn==c) {
                    pointerColumn=0;
                    pointerRow++;
                }
            }
        }
        return result;
    }
}

/**
 * Approach 2 -> One for loop + modulo operator
 *
 *
 * Time Complexity -> O(n*m)
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime: 5 ms, faster than 15.00% of Java online submissions for Reshape the Matrix.
 *   Memory Usage: 50.8 MB, less than 36.27% of Java online submissions for Reshape the Matrix.
 *
 * Reference
 *   https://leetcode.com/problems/reshape-the-matrix/discuss/102491/Java-Concise-O(nm)-time
 */
class Solution0566_2 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (r*c != mat.length*mat[0].length) return mat;

        int m = mat[0].length;
        int[][] res = new int[r][c];
        for (int i=0;i<r*c;i++) {
            res[i / c][i % c] = mat[i / m][i % m];
        }
        return res;
    }

}