package com.wenbin.logic.dp;

/**
 * 最大正方形 https://leetcode-cn.com/problems/maximal-square/
 */
public class MaximalSquare {

  public int maximalSquare(char[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }

    int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
    int max = 0;
    for (int i = 1; i <= matrix.length; i++) {
      for (int j = 1; j <= matrix[0].length; j++) {
        if (matrix[i - 1][j - 1] != '1') {
          continue;
        }

        dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
        max = Math.max(dp[i][j], max);
      }
    }

    return max * max;
  }
}
