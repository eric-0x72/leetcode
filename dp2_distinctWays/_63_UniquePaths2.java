package dp2_distinctWays;

import java.util.Arrays;

public class _63_UniquePaths2 {

    public static void main(String[] args) {
        int[][] a = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

        int res = uniquePathsWithObstacles(a);
        System.out.println(res);
    }

    public static int uniquePathsWithObstacles(int[][] grids) {
        int m = grids.length, n = grids[0].length;

        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (grids[i - 1][j - 1] == 1) {
                    dp[i][j] = 0;
                }

                if (!(i == 1 && j == 1)) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        for (int[] a : dp) {
            System.out.println(Arrays.toString(a));
        }
        return dp[m][n];
    }
}
