class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int start=prices[0];
        for(int i =1;i<prices.length;i++){
            
            if(start<prices[i]){
                maxProfit+=prices[i] - start;
            }
            start=prices[i];
        }
        return maxProfit;
        
    }
}