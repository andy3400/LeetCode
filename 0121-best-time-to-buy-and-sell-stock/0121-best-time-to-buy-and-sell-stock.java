class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit = 0;
        
        int minPrice = 9999;

        for(int price : prices){
            if(price < minPrice) minPrice = price;
            else if(price - minPrice > MaxProfit){
                MaxProfit = price - minPrice;
            }
        }
        return MaxProfit;
    }
}