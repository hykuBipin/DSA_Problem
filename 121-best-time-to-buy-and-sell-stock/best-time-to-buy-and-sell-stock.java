class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int minprice=prices[0];
        int maxprofit=Integer.MIN_VALUE;

        for(int price: prices)
        {
            minprice = Math.min(minprice,price);
            maxprofit = Math.max(maxprofit,price-minprice);
        }
        return maxprofit;
    }
}