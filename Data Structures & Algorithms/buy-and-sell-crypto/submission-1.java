class Solution {
    public int maxProfit(int[] prices) {
        int minimum=prices[0],max=0;
        for(int j=0;j<prices.length;j++){
         minimum=Math.min(minimum,prices[j]);
        int profit=prices[j]-minimum;
        max=Math.max(max,profit);
        }
        return max;
    }
}
