class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuilder a=new StringBuilder();
       while(columnNumber>0)
       {
        columnNumber--;
        char c=(char)(columnNumber%26+'A');
        columnNumber/=26;
        a.append(c);
       }
       a.reverse();
       return a.toString();
    }
}