class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int n=prices.length;
        int max=0;
        for(int i=0;i<n;i++)
        { 
            if(min>prices[i])
            {
                min=prices[i];
                
            }
            else
            {
                int profit=prices[i]-min;
                if(max<profit)
                {
                  max=profit;  

                }
            

            }
            
            
                
            

            
        }
        return max;
        
    }
}