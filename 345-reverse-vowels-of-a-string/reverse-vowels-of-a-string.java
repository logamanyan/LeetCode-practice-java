class Solution {
    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {

            
            while (i < j && !isVowel(sb.charAt(i))) {
                i++;
            }

            while (i < j && !isVowel(sb.charAt(j))) {
                j--;
            }

          
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
