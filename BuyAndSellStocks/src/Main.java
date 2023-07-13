

/* Q. Best to Buy and Sell stocks
        You are given an array prices where prices[i] is the price of a given stocks on the ith day.
        You want to maximize your profit by choosing a single day to buy one stocks and choosing a different
        day in the future to sell that stocks.
                            Return the maximize profit you can achieve from this transaction. If you cannot achieve any profit
                            return 0.
*/

public class Main {

    //Function
    public static int buyAndSellStocks(int prices[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){

                int profit = prices[i] - buyPrice;

                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice =prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {

        int prices[] = {8,2,6,4,7,5};

        System.out.print(buyAndSellStocks(prices));
    }
}