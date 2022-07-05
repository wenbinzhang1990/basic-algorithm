package com.wenbin.logic.dp;

/**
 * 爬楼梯 https://leetcode-cn.com/problems/climbing-stairs
 */
public class ClimbingStairs {

  public int climbStairs(int n) {
    if (n <= 1) {
      return 1;
    }

    int[] dp = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }
}
