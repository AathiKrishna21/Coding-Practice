//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class Solution {
    public int maxProfit(int[] prices) {
        int i,m=0;
        for(i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                m+=prices[i]-prices[i-1];
            }
        }
        return m;
    }
}