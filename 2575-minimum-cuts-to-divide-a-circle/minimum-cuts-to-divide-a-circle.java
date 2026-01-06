class Solution {
    public int numberOfCuts(int n) {
        int cut=0;
        if(n==1)
        {
            return 0;
        }
        if(n%2==0)
        {
            cut=n/2;
        }
        else
        {
            cut=n;
        
        }

        return cut;
        
    }
}