package BestTimeToBuySellStock;

/*
Approach: 
1. Track the minimum price while iterating
2. Compute max profit at each step.
*/

public class main {
    public static void main(String[] args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
    // Time Complexity: O(N), Space Complexity: O(1)
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price; // Update min price
            }else{
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
