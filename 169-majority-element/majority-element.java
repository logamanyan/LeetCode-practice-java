class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int k=n/2;
    int count=1;
       
       
        
        if(n==1)
        {
            return nums[0];
        }
        int a=nums[0];        
        for(int i=1;i<n;i++)
        {
            if(nums[i]==a)
            {
                count++;

            }
            else
            {
                count--;
                if(count==0)
                {
                    a=nums[i];
                    count=1;
                }

            
            }
           
           
            

        }
        return a;
    }
}