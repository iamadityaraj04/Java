/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/ 

public class javaPractice10 {
    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int sufixMax[]=new int[prices.length];
        sufixMax[sufixMax.length-1]=prices[prices.length-1];
        for(int i=sufixMax.length-2;i>=0;i--){
            sufixMax[i]=Math.max(sufixMax[i+1],prices[i]);
        }
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            maxProfit=Math.max((sufixMax[i]-prices[i]),maxProfit);
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    } 
}
