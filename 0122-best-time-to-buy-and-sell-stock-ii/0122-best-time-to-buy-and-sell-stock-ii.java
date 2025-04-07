class Solution {
    public int maxProfit(int[] prices) {
        int maxBenefit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                maxBenefit +=prices[i] - prices[i-1];
            }
        }
        return maxBenefit;
    }
}