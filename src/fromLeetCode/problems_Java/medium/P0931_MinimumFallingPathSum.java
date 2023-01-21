package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Array
    -> Dynamic Programming
    -> Matrix

    Problem
    -> https://leetcode.com/problems/minimum-falling-path-sum/

        Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
        A falling path starts at any element in the first row and chooses the element in the next row that
        is either directly below or diagonally left/right. Specifically,
        the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).



    Examples
    -> Example 1
            Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
            Output: 13
            Explanation: There are two falling paths with a minimum sum as shown.
    -> Example 2
            Input: matrix = [[-19,57],[-40,-5]]
            Output: -59
            Explanation: The falling path with a minimum sum is shown.

    Constraints
    -> n == matrix.length == matrix[i].length
    -> 1 <= n <= 100
    -> -100 <= matrix[i][j] <= 100
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
 *   Runtime 4 ms Beats 73.71% | Memory 43 MB Beats 79.62%
 *
 * Reference
 *   https://leetcode.com/problems/minimum-falling-path-sum/solutions/186689/java-dp-solution-with-graph-illustrated-explanations/
 */
class Solution0931_1_Matrix_DP {
    public int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // DP matrix has 2 extra columns
        int[][] dp = new int[rows][cols + 2];
        // Fill the first row of DP matrix
        for (int i = 1; i <= cols; i++) {
            dp[0][i] = matrix[0][i - 1];
        }
        // Fill Integer.MAX_VALUE into first and last column of DP matrix
        for (int i = 0; i < rows; i++) {
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][cols + 1] = Integer.MAX_VALUE;
        }
        // Building the DP matrix
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Find the minimum neighbor from previous row in DP matrix
                int minNeighbor = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                minNeighbor = Math.min(minNeighbor, dp[i - 1][j + 1]);
                dp[i][j] = matrix[i][j - 1] + minNeighbor;
            }
        }
        // The minimum path sum is minimum of the last row in DP matrix
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= cols; i++) {
            min = Math.min(min, dp[rows - 1][i]);
        }
        return min;
    }
}


/**
 * Approach 2 ->
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
 *
 *
 * Reference
 *   https://leetcode.com/problems/minimum-falling-path-sum/solutions/186689/java-dp-solution-with-graph-illustrated-explanations/
 */
class Solution0931_2_Memoized {
    private int m, n;
    Integer[][] memo;

    public int minFallingPathSum(int[][] matrix) {
            m = matrix.length;
            n = matrix[0].length;
            memo = new Integer[m][n];
            int res = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++)
                res = Math.min(res, dfs(matrix, 0, j));//start at every cell in first row

            return res;

    }

        private int dfs(int[][] nums, int i, int j){
            if(i == m) return 0;
            if(j < 0 || j >= n) return Integer.MAX_VALUE;

            if(memo[i][j] != null) return memo[i][j];

            int left = dfs(nums, i + 1, j - 1);
            int right = dfs(nums, i + 1, j + 1);
            int middle = dfs(nums, i + 1, j);

            memo[i][j] = nums[i][j] + Math.min(left, Math.min(right, middle));//take min of all paths and add current cell value

            return memo[i][j];
        }

}