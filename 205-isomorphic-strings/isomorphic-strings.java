class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> maps= new HashMap<>();
        HashMap<Character,Integer> mapt=new HashMap<> ();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char c1= s.charAt(i);
            char c2= t.charAt(i);
            if(!maps.containsKey(c1))
            {
                maps.put(c1,i);
            }
            if(!mapt.containsKey(c2))
            {
                mapt.put(c2,i);
            }
            if(!maps.get(c1).equals(mapt.get(c2)))
            {
                return false;
            }

           


                
         }
       

        
     
        return true;
            
    }
}