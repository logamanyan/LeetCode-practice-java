class Solution {
    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            if(isVowel(sb.charAt(i))&&isVowel(sb.charAt(j)))
            {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;

            }
            else if(!isVowel(sb.charAt(i)))
            {
                i++;
            }
            else
            {
                j--;
            }
             }
            

        return sb.toString();
    }

    private boolean isVowel(char c) {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U' )
        {
            return true;
        }
        return  false;
    
    }
}
