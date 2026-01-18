class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String a = str1+str2;
        String b =str2+str1;
        
         if(!a.equals(b))
         {
            return "";
         }
         int n1=str1.length();
         int n2=str2.length();

         while(n2!=0)
         {
            int temp=n2;
            n2 =n1%n2;
            n1=temp;
         }


     return a.substring(0,n1);   
    }
}