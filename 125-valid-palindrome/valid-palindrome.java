class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String s1= new StringBuilder(s).reverse().toString();
        System.out.print(s1);
        return s.equals(s1);
    }
}