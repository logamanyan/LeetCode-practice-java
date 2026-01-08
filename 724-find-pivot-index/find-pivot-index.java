class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        
    for(int i=0;i<n;i++)
{
    int sum=0;
        int s=0;
    for(int j=0;j<n;j++)
    {
        if(j<i)
        {
            sum+=nums[j];
        }
        else if(j>i)
        {
            s+=nums[j];

        }
    }
    if(sum==s)
    {
        return i;
    }



    }
    return -1;
        
    }
}