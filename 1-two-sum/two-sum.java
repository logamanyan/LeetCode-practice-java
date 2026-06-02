class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]= new int[2];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int c= target-nums[i];
            if(h.containsKey(c))
            {
                result[0]=h.get(c);
                result[1]=i;

                return result;
            }
            else
            {
                h.put(nums[i],i);
            }


        }
        return result;
    }
}