class Solution {
    public int maxProfit(int[] prices) {
//         int dscOrder = 1;
//         for(int i = 1; i < prices.length; i++){ 
//             if(prices[i-1] > prices[i]){ 
//                 dscOrder++; // 
//             }
//         }
        
//         if(dscOrder == prices.length){
//             return 0;
//         }
     
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){ // i = 0 1 2 3 4 5  X
            if(bp < prices[i]){
                int profit = prices[i] - bp; // 4 2 5 3
                maxProfit = Math.max(maxProfit, profit);
            }else{
                bp = prices[i]; // 7 1
            }
        }
        return maxProfit;
    }
}