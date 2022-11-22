package fromLeetCode.problems_Java.medium;

import java.util.*;

/*
    Related Topics
    -> Math
    -> Dynamic Programming
    -> Breadth-First Search

    Problem
    -> https://leetcode.com/problems/perfect-squares/

        Given an integer n, return the least number of perfect square numbers that sum to n.
        A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
        For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.

    Examples
    -> Example 1
            Input: n = 12
            Output: 3
            Explanation: 12 = 4 + 4 + 4.
    -> Example 2
            Input: n = 13
            Output: 2
            Explanation: 13 = 4 + 9.

    Constraints
    -> 1 <= n <= 10^4
 */



/**
 * Approach 1 -> Math
 *
 *
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *
 * Reference
 *
 */
class Solution0279_1 {
    public int numSquares(int n) {

        int count = 0, num = 1;

        while(true){
            if (num*num <= n) count++;
            else break;

            num++;
        }

        return count;
    }
}


/**
 * Approach 2 -> BFS
 *
 *    Check reference
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *
 * Reference
 *   https://leetcode.com/problems/perfect-squares/discuss/317378/Java-3-solutions-BFS-DP-Maths-with-explanation
 */
class Solution0279_2 {

    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> reviewedSet = new HashSet<>();

        if(n >0) queue.offer(n);
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            for(int i=0; i<size; i++) {
                int val = queue.poll();
                if(!reviewedSet.add(val)) continue;

                for(int j=1; j<=Math.sqrt(val); j++){
                    if(val-(j*j) == 0) return level;
                    queue.offer(val-(j*j));
                }
            }
        }

        return level;
    }

}

/**
 * Approach 3 -> DP
 *
 *    Check reference
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *
 * Reference
 *   https://leetcode.com/problems/perfect-squares/discuss/317378/Java-3-solutions-BFS-DP-Maths-with-explanation
 *   https://leetcode.com/problems/perfect-squares/discuss/1173545/Java-or-All-3-Solutions%3A-Recursive-Memoized-and-DP
 */
class Solution0279_3 {
//    dp[0] = 0
//    dp[1] = dp[0]+1 = 1
//    dp[2] = dp[1]+1 = 2
//    dp[3] = dp[2]+1 = 3
//    dp[4] = Min{ dp[4-1*1]+1, dp[4-2*2]+1 }
//      = Min{ dp[3]+1, dp[0]+1 }
//      = 1
//    dp[5] = Min{ dp[5-1*1]+1, dp[5-2*2]+1 }
//      = Min{ dp[4]+1, dp[1]+1 }
//      = 2
//              .
//              .
//              .
//    dp[13] = Min{ dp[13-1*1]+1, dp[13-2*2]+1, dp[13-3*3]+1 }
//       = Min{ dp[12]+1, dp[9]+1, dp[4]+1 }
//       = 2
//               .
//               .
//               .
//    dp[n] = Min{ dp[n - i*i] + 1 },  n - i*i >=0 && i >= 1
//    and the sample code is like below:

    public int numSquares(int n) {
        int[] dp = new int[n+1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=Math.sqrt(i); j++){
                dp[i] = Math.min(dp[i], (dp[i-(j*j)]+1));
            }
        }

        return dp[n];
    }

}


class Solution0279_3_1 {
    public int numSquares(int n) {
        int dp[]=new int [n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<dp.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                min=Math.min(min,dp[i-j*j]);
            }
            dp[i]=min+1;
        }
        return dp[n];
    }
}
/**
 * Approach 4 -> Math
 *
 *    Check reference
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime: 1 ms, faster than 100.00% of Java online submissions for Perfect Squares.
 *   Memory Usage: 39.6 MB, less than 99.12% of Java online submissions for Perfect Squares.
 *
 * Reference
 *   https://leetcode.com/problems/perfect-squares/discuss/317378/Java-3-solutions-BFS-DP-Maths-with-explanation
 */
class Solution0279_4 {
    public int numSquares(int n) {

// Lagrange's Four Square theorem : every positive integer can be written as the sum of at most four squares
        // answer to this question can be 1 or 2 or 3 or 4 only.


        if(n == 0) return 0;

        // case 1:
        if(isSqrt(n)) return 1;

        // case 2 :If answer is 2 => one factor has to be (int)square_root and remaining other number has to be a perfect square
        for(int i=1; i<=Math.sqrt(n); i++){
            if(isSqrt(n-(i*i))) return 2;
        }

        // case 4: a positive integer can be expressed as the sum of three squares if and only if it is not of the form 4^k(8m+7) for some int k and m see "not of" in above line

        // in order to pass 28 as 4
        while(n%4 ==0)
            n=n/4;

        if(n%8 == 7){
            return 4;    // handling 4^k
        }

        // case 3
        return 3;
    }

    private boolean isSqrt(int n){
        int sqrt = (int)Math.sqrt(n);

        return n-(sqrt*sqrt)==0;
    }
}


/**
 * Approach 5 -> Memoization
 *
 *    Check reference
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *
 * Reference
 *   https://leetcode.com/problems/perfect-squares/discuss/1173545/Java-or-All-3-Solutions%3A-Recursive-Memoized-and-DP
 */
class Solution0279_5 {
    public int numSquares(int n){
        int arr[]=new int[n+1];
        return helper(n,arr);
    }

    public int helper(int n,int arr[]){
        if(n<0) return Integer.MAX_VALUE;  //Taking min later on
        if(n==0) return 0;

        if(arr[n]>0) return arr[n];

        int min=n;

        for(int i=1;i*i<=n;i++){
            min=Math.min(min,helper(n-(i*i),arr));
        }
        arr[n]=min+1;
        return min+1;
    }
}


/**
 * Approach 6 -> Recursive
 *
 *    Check reference
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *
 * Reference
 *   https://leetcode.com/problems/perfect-squares/discuss/1173545/Java-or-All-3-Solutions%3A-Recursive-Memoized-and-DP
 */
class Solution0279_6 {
    public int numSquares(int n){
        return helper(n);
    }

    public int helper(int n){
        if(n<0) return Integer.MAX_VALUE;  //Taking min later on
        if(n==0) return 0;

        int min=n;

        for(int i=1;i*i<=n;i++){
            min=Math.min(min,helper(n-(i*i)));
        }
        return min+1;
    }
}