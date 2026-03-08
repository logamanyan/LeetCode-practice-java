class Solution {
    public boolean canJump(int[] nums) {
    
    int n=nums.length;
    int maxl=0;
    for(int i=0;i<n;i++)
    {
        if(i>maxl)
        {
            return false;
        }
        maxl=Math.max(maxl,i+nums[i]);
    }
    return true;
        
    }
}