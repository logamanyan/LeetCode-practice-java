class Solution {
    public String categorizeBox(int length, int width, int height, int mass) 
    {
        long v=(long)length*width*height;
        if((v<1000000000&&length<10000&&width<10000&&height<10000)&&mass>=100)
        {
            return "Heavy";

        }
        else if((v>=1000000000||length>=10000||width>=10000||height>=10000)&&mass>=100)
        {
             return "Both";

        }
         else if((v>=1000000000||length>=10000||width>=10000||height>=10000)&&mass<100)
         {
            return "Bulky";

         }
          else 
          {
            return "Neither";

          }
          
    
}
}
