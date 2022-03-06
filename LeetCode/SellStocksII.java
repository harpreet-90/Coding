

public class SellStocksII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i=1; i<prices.length; i++){
            if((prices[i] >= buy) && (prices[i] > prices[i-1] ) && (((prices.length > i+1) && (prices[i] > prices[i+1])) || prices.length == i+1)) {
                profit += (prices[i] - buy);
                if(prices.length == i+1){
                    buy = prices[i];
                    i++;
                }
            }
        }
        return profit;
    }
}
