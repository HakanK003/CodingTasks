package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Dynamic Programing

    Problem
    -> https://leetcode.com/problems/domino-and-tromino-tiling/

        You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.
        Given an integer n, return the number of ways to tile an 2 x n board.
        Since the answer may be very large, return it modulo 10^9 + 7.
        In a tiling, every square must be covered by a tile.
        Two tilings are different if and only if there are two 4-directionally adjacent cells on the board
        such that exactly one of the tilings has both squares occupied by a tile.


    Examples
    -> Example 1
            Input: n = 3
            Output: 5
            Explanation: The five different ways are show above.
    -> Example 2
            Input: n = 1
            Output: 1

    Constraints
    -> 1 <= n <= 1000
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
 *  Runtime 1 ms Beats 90.51% | Memory 39.5 MB Beats 78.10%
 *
 * Reference
 *   https://leetcode.com/problems/domino-and-tromino-tiling/solutions/1600275/java-dp-diagrams-explanation/
 */
class Solution0790_1 {
    public int numTilings(int n) {
        if(n <= 2)
            return n;

        int mod = 1_000_000_007;
        long[] fullTiling = new long[n+1];
        long[] partTiling = new long[n+1];

        fullTiling[1] = 1;
        fullTiling[2] = 2;

        partTiling[1] = 0;
        partTiling[2] = 1;

        for(int i=3; i <= n; i++){
            fullTiling[i] = (fullTiling[i-1] + fullTiling[i-2] + 2 * partTiling[i-1]) % mod;
            partTiling[i] = (partTiling[i-1] + fullTiling[i-2]) % mod;
        }
        return (int)(fullTiling[n]);
    }
}