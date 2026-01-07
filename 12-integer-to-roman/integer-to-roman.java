class Solution {
public String intToRoman(int num) {
    int n=num;
        int count=0;
        StringBuilder s = new StringBuilder();
        while(n>0)
        {
            int l=n%10;
            count++;
            n=n/10;
        }
        
        n=num;
        
       
        while(count>0)
        {
         int p=1;
         int c=count; 
        while(c>1)
        {
            p=p*10;
            c--;
            
            
        }
        if(p>=1000)
        {
            int l=n/p;
            String s1 ="M".repeat(l);
            s.append(s1);
            n=n-(l*p); 
          
            
            
            
            
        }
        else if(p==100)
        {
            int l=n/p;

              if(l>5)
              {
                  if(l==9)
                  {
                      s.append("C");
                      s.append("M");
                      n=n-(l*p);
                      
                  }
                  else{
                    s.append("D");
                 int a=l-5;
                 String s1 ="C".repeat(a);
                  s.append(s1);
                  n=n-(l*p);
                      
                  }
               
                  
                 
                 
              }
              else if(l<5)
              
              {
                  if(l==4)
                  {
                      s.append("C");
                      s.append("D");
                      n=n-(l*p);
                      
                  }
                  else
                  
                  {
                  String s1 ="C".repeat(l);
                  s.append(s1);
                  n=n-(l*p);
                  
                  }
                  
                 
              }
              else
              {
                   s.append("D");
                   n=n-(l*p); 
                  
              }
            
            
         }
         else if(p==10)
         {
             int l=n/p;
             if(l>5)
            {
                if(l==9)
                {
                    s.append("X");
                      s.append("C");
                      n=n-(l*p);
                    
                }
                else
                {
                    s.append("L");
                 int a=l-5;
                 String s1 ="X".repeat(a);
                  s.append(s1);
                  n=n-(l*p); 
                    
                }
                 
            }
              else if(l<5)
              
              {
                  if(l==4)
                  {
                      s.append("X");
                      s.append("L");
                      
                  
                  n=n-(l*p);
                      
                  }
                  else
                  
                  {
                  String s1 ="X".repeat(l);
                  s.append(s1);
                  n=n-(l*p);
                  
                  }
                   
                  
                 
              }
              else if(l==1)
              {
                   s.append("X");
                   n=n-(l*p); 
                  
              }
              else if(l==5)
              {
                   s.append("L");
                   n=n-(l*p); 
                  
              }
             
         }
         else if(p==1)
         {
             int l=n/p;
             if(l>5)
            {
                if(l==9)
                {
                    s.append("I");
                      s.append("X");
                      n=n-(l*p);
                    
                }
                else
                {
                s.append("V");
                 int a=l-5;
                 String s1 ="I".repeat(a);
                  s.append(s1);
                  n=n-(l*p);
                }
                    
            }
                
                 
            
             
        
             else if(l<5)
              
              {
                  if(l==4)
                  {
                      s.append("I");
                      s.append("V");
                      
                  
                  n=n-(l*p);
                      
                  }
                  else
                  {
                  String s1 ="I".repeat(l);
                  s.append(s1);
                  n=n-(l*p);
                  
                  }
                   
                  
                 
              }
              else
              {
                   s.append("V");
                   n=n-(l*p); 
                  
              }
             
         }
         
         
         
         count--;
         
       
         }
         return s.toString();
        
    }
};