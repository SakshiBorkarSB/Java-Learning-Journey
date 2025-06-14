/*
    You are given an arrayprices where prices[i] is the priceof a given stockon the ith day. Return the maximum profit you can achievefrom this transaction. If you cannot achieve any profit, return 0.

    Example:
        input: prices = [7,1,5,3,6,4]
        output: 5
        explanation: Buy on day 2 (price =1) and sell on day 5 (price=6), profit=6-2=5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell
 */


import java.util.*;

public class Java103 {
    public static int Stocks(int prices []){
        int buy = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(buy < prices[i]){
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        // size 
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array");
        int prices[] = new int[size];
        for(int i = 0; i < size; i++){
            prices[i] = sc.nextInt();
        }

        // call the function
        System.out.println(Stocks(prices));
    }
}
