class Solution {
    public int maxArea(int[] height) {
       int n=height.length-1;
       int l=0;
       int r=n;
       int max=0;
       while(l<r)
       {
        
        int h=Math.min(height[l],height[r])*(r-l);
        max=Math.max(max,h);

        if(height[l]<height[r])
        {
            l++;
        }
        else
        {
            r--;
        }

        
         

       }
       return max;
    }
}