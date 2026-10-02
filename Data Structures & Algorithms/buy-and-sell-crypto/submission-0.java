class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,profit,max=0;
        for(int i=0;i<prices.length;i++){
             min=Math.min(min,prices[i]);
            profit = prices[i]-min;
            max=Math.max(max,profit);
        }
        return max;
    }
}
