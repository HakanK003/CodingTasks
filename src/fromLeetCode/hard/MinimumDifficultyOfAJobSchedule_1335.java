package fromLeetCode.hard;

public class MinimumDifficultyOfAJobSchedule_1335 {


    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (n < d) return -1;

        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = Math.max(dp[i + 1], jobDifficulty[i]);
        }

        for (int t = 1; t <= d; t++) {
            for (int i = 0; i <= n - t; i++) {
                int m = 0; dp[i] = 10010;
                for (int j = i; j <= n - t; j++) {
                    m = Math.max(m, jobDifficulty[j]);
                    dp[i] = Math.min(dp[i], m + dp[j + 1]);
                }
            }
        }
        return dp[0];
    }


//
//[11,111,22,222,33,333,44,444]
//6
//    public int minDifficulty(int[] jobDifficulty, int d) {
//
//        if (d>jobDifficulty.length) return -1;
//
//        int result =0;
//        int index = jobDifficulty.length-1;
//
//        for (int i = d; i > 0; i--) {
//
//            int maxDifficultyPerDay = jobDifficulty[index];
//            index--;
//
//            if (d==1){
//
//
//                for (int j = index; j > -1; j++) {
//
//                    if (maxDifficultyPerDay<jobDifficulty[j]) maxDifficultyPerDay = jobDifficulty[j];
//
//                }
//
////                while(index>=0){
////
////                    if (maxDifficultyPerDay<jobDifficulty[index]) maxDifficultyPerDay = jobDifficulty[index];
////                    index--;
////
////                }
//
//            }
//
//            result+=maxDifficultyPerDay;
//
//        }
//
//
//
//        return result;
//
//    }

}
