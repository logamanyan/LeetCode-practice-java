class Solution {
    public int jump(int[] nums) {
    int n= nums.length;
    int steps=0;
    int c=0;
    int max=0;
    for(int i=0;i<n-1;i++)
    {
       max=Math.max(max,nums[i]+i);
      if(i==c)
      {
         c=max;;
         steps++;

      }
   
       

    }

        return steps;
    }
}