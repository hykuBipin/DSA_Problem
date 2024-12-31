class Solution {
    public int maxProfit(int[] prices, int fee) {
        int m=prices.length;
        int[] cash=new int[m];
        int[] hold=new int[m];

        if(prices.length==0||prices==null) return 0;

        cash[0]=0;
        hold[0]=-prices[0];
        for(int i=1;i<m;i++)
        {
            cash[i]=Math.max(cash[i-1],hold[i-1]+prices[i]-fee);
            hold[i]=Math.max(hold[i-1],cash[i-1]-prices[i]);
        }
        return cash[m-1];
    }
} 