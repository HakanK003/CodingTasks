package fromLeetCode.medium;

public class NumberOfDiceRollsWithTargetSum {

    public int numRollsToTarget(int n, int k, int target) {

        if (n==1)       return (target <= k)? 1 : 0;
        if (n*k<target) return 0;

        int result = 0;

        //ilkinin yuz sayisi kadar base
        //zar sayisi kadar hepsi icin donucek
        //
        //en icteki yuz sayisi jadar donucek
        for (int i = 0; i < k; i++) {

            for (int j = 0; j < n; j++) {

                int currentCount = 0;

                for (int l = 0; l < k; l++) {

                    currentCount+=l;

                }

                if (currentCount == target) result++;

            }

        }

        return result;


    }

    public int numRollsToTarget2(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;

        int MOD = 1000000007;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (j > i * k) break;
                for (int l = 1; l <= k && l <= j;l++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - l]) % MOD;
                }
            }
        }
        return dp[n][target];    }
}
