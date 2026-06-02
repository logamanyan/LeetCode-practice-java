class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        if(nums.length==0)
        {
             return 0;

        }
       
        for(int i=0;i<nums.length;i++)
        {
            p.add(nums[i]);
        }
        int c=1;
        int l=1;
        int prev=p.poll();
    while(!p.isEmpty())
        {
           
        
             int curr=p.poll();

           
           if( prev==curr)
           {
            continue;

           }
        else if(prev+1==curr)
           {
            c++;
           }
           else
           {
            l=Math.max(c,l);
            c=1;
           }
        

        prev=curr;
          
           
        }
        return Math.max(c,l); 
    }
}