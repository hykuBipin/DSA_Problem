class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null) return -1;
        int n=prices.length;
        
        int buy=Integer.MIN_VALUE;
        int sell=0;
        int cooldown=0;

        for(int price : prices)
        {
           int prevbuy =buy;
           int prevsell = sell;
           
           buy = Math.max(buy, cooldown - price);
           sell = Math.max(sell, prevbuy + price);
           cooldown = prevsell;

        }
        return sell;
    }
}