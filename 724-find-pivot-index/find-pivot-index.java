class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
    int sum=0;
    for(int j=0;j<n;j++)
    {
        sum=sum+nums[j];
    
    }
    int left=0;
    for(int i=0;i<n;i++)
    {
        
         int right=sum-left-nums[i];
        if(left==right)
        {
            return i;
        }
        left += nums[i];
    }
    return -1;
        
    }
}