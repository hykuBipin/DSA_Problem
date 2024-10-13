class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; int maxfinal =0 ; int maxtemp=0;
        for(int i=1; i < prices.length; i++)
        {
         maxtemp = Math.max(0,maxtemp += prices[i] - prices[i-1]);
         maxfinal= Math.max(maxtemp,maxfinal);
    }
    return maxfinal;
  }
}