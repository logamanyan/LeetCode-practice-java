class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int r=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            r+=i+1;
        }
        return r-sum;

    }
}