package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Array
    -> Matrix
 */

public class ImageOverlap_835 {

    //TODO WTF
    public int largestOverlap(int[][] img1, int[][] img2) {

        int n = img1.length;

        int max = 0;

        for (int oi = -(n - 1); oi < n; oi++) {
            for (int oj = -(n - 1); oj < n; oj++) {

                int match = 0;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i + oi >= 0 && j + oj >= 0 &&
                                i + oi < n && j + oj < n &&
                                img1[i][j] == img2[i + oi][j + oj] && img1[i][j] == 1) {
                            match += 1;
                        }
                    }
                }

                max = Math.max(match, max);

            }
        }

        return max;

    }

}


//TODO 41200kb example solution
//
//class Solution {
//
//    public int largestOverlap(int[][] a, int[][] b) {
//        int n = a.length;
//        int max = 0;
//        for (int dx = -n - 1; dx < n; dx++) {
//            for (int dy = -n - 1; dy < n; dy++) {
//                max = Math.max(max, countOverlap(a, b, dx, dy));
//            }
//        }
//
//        return max;
//    }
//
//    public int countOverlap(int[][] a, int[][] b, int dx, int dy) {
//        int n = a.length;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            int x = i + dx;
//            if (x < 0 || x >= n) {
//                continue;
//            }
//            for (int j = 0; j < n; j++) {
//                int y = j + dy;
//                if (y < 0 || y >= n) {
//                    continue;
//                }
//                if (a[x][y] == 1 && b[i][j] == 1) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }
//}


//TODO 4ms example solution
//
//class Solution {
//    int n;
//    public int largestOverlap(int[][] img1, int[][] img2) {
//        n = img1.length;
//        int ans = 0;
//
//        int N = img1.length;
//    int[][] count = new int[2 * N + 1][2 * N + 1];
//    for (int i = 0; i < N; i++) {
//      for (int j = 0; j < N; j++) {
//        if (img1[i][j] == 1) {
//          for (int i2 = 0; i2 < N; i2++) {
//            for (int j2 = 0; j2 < N; j2++) {
//              if (img2[i2][j2] == 1) {
//                count[i-i2+N][j-j2+N] += 1;
//              }
//            }
//          }
//        }
//      }
//    }
//    //int ans = 0;
//    for (int[] row: count) {
//      for (int v: row) {
//        ans = Math.max(ans, v);
//      }
//    }
//
//
//        //for(int i = 0; i < n; i++) { //row shift
//        //    for(int j = 0; j < n; j++) {  //col shift
//        //        ans = Math.max(ans, count(img1, img2, i, j));
//        //        ans = Math.max(ans, count(img2, img1, i, j));
//        //    }
//        //}
//        return ans;
//    }
//    int count(int[][] img1, int[][] img2, int r, int c) {
//        int over1 = 0, over2 = 0;
//        for(int i = r; i < n; i++) {
//            for(int j = c; j < n; j++) {
//                over1 += img1[i-r][j-c] & img2[i][j]; //right
//                over2 += img1[i-r][j] & img2[i][j-c]; //left
//            }
//        }
//        return Math.max(over1, over2);
//    }
//}