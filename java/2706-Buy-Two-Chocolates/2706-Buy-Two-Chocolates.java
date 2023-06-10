class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int min1 = 0;
        int min2 = 1;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < prices[min1]){
                min2 = min1;
                min1 = i;
            }
            else if(prices[i] < prices[min2] && i != 0){
                min2 = i;
            }
        }

        if(prices[min1] + prices[min2] <= money){
            return money-prices[min1]-prices[min2];
        }
        else return money;
    }
}