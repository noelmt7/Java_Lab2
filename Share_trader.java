package LAB_2;

import java.util.Scanner;

public class Share_trader {
    static int maxProfit;
    static int[] prices;
    static int size;
    public static int findMaxProfit(int[] prices){
        int n = prices.length;
        int profit = 0;
        int buyprice = prices[0];
        for (int i =1; i<n; i++){
            if (prices[i]<prices[i-1]){
                profit = profit + prices[i-1]-buyprice;
                buyprice = prices[i];
            }
        }
        profit += prices[n-1]-buyprice;
        return profit;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of Stock prices: ");
            size = sc.nextInt();
            int [] prices = new int[size];
            
            System.out.println("Enter Stock Prices (buy->Sell)");
            
            for (int i= 0; i< size; i++){
                //System.out.println("Price"+(i+1)+":");
                prices[i] = sc.nextInt();
            }

            System.out.println("ANswer "+findMaxProfit(prices));
        }


    }    
}
