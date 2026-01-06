class Solution {
    public int findComplement(int num) {

int n=num;

int a=0,s=1;
     
   while(n>0)
   {
    int l=n%2;
   n=n/2;

    l=1-l;
     a=a+(s*l);
     s=s*2;
   
     
   



    
    

}

     return a;
        
    }
}