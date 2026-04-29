class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=0) return 0;
        int n=prices.length;
        int profit=0;
        int minprice=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(prices[i] < minprice)
            {
                minprice=prices[i];
            }
            profit = Math.max(profit,prices[i]-minprice);
        }

        return profit;
    }
}