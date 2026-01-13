class Solution {
    public int lastStoneWeight(int[] stones) {
        int n= stones.length;
       PriorityQueue <Integer> p = new PriorityQueue<>(Collections.reverseOrder());
    
      for (int i = 0; i < stones.length; i++)
       {

        p.offer(stones[i]);
       }

       while(p.size()>1)
       {
int a=p.poll();
int b=p.poll();
if(a==b)
{
    continue;
}
else
{
    p.add(a-b);
}

       }

return p.isEmpty() ? 0 : p.peek();

    }
}