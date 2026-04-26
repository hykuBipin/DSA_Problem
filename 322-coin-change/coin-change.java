class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) return -1;
        if (amount == 0) return 0;
        int n= coins.length;
        
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int cap=1;cap<=amount;cap++)
        {
            for(int coin:coins)
            {
                if(coin <= cap)
                {
                    dp[cap] = Math.min(dp[cap],dp[cap-coin]+1);
                }
            }
        }
          return dp[amount] > amount ? -1 : dp[amount];
    }
}