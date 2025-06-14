// Buying and Selling stocks

import java.util.*;

public class Java100 {
    public static int BuyAndSell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            // prices[i] == selling price 
            if(buyPrice < prices[i]){   // Profit
                int profit = prices[i] - buyPrice;    // Today's profit
                maxProfit = Math.max(maxProfit, profit);   // Global profit
            }
            else{
                // aaj profit nahi hua so we can buy the stocks instead
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        // number of days
        System.out.println("Enter the number of days");
        int days = sc.nextInt();

        // enter the prices
        System.out.println("Enter the prices");
        int prices[] = new int[days];
        for(int i = 0; i < days; i++){
            prices[i] = sc.nextInt();
        }

        // call function
        System.out.println("Maximum Profit: " + BuyAndSell(prices));
    }
}
