class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        ArrayList<Boolean> list =new ArrayList<>();
        for(int  e: candies)
        {
            if(max<e)
            {
                max=e;
            }
        }
        for(int e : candies)
        {
            if(max> e+extraCandies)
            {
                list.add(false);
            }
            else
            {
                list.add(true);
            }
        }
    


      return list ; 
    }
}