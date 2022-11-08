package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Array
    -> Matrix
 */

public class ToeplitzMatrix_766 {

    //Runtime: 2 ms, faster than 42.33% of Java online submissions for Toeplitz Matrix.
    //Memory Usage: 45.1 MB, less than 81.87% of Java online submissions for Toeplitz Matrix.
    public boolean isToeplitzMatrix(int[][] matrix) {

        for (int i = 1; i < matrix.length; i++) {

            for (int j = 1; j < matrix[1].length; j++) {

                if (matrix[i][j]!=matrix[i-1][j-1]) return false;

            }

        }

        return true;
    }

}
