class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        while(n>0)
        {
            int l=n%10;
            rev=10*rev+l;
            n=n/10;
            
        }
        if(x==rev)
        {
            return true;
        }
        return false;
    }
}