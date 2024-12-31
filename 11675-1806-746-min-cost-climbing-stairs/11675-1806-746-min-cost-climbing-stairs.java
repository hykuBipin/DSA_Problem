class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int m=cost.length;
        int[] dp=new int[m];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<m;i++)
        {
            dp[i]= cost[i]+ Math.min(dp[i-1],dp[i-2]);
        }
      return Math.min(dp[m-1],dp[m-2]);
    }
}