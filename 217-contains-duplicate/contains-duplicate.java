class Solution {
    public boolean containsDuplicate(int[] nums) {
         int n=nums.length;
         int a=0;
HashSet<Integer> h=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            
            if(h.contains(nums[i]))
            {
                return true;

            }
            else
            {
                h.add(nums[i]);
            }
        }
        return false;
        
    }
}