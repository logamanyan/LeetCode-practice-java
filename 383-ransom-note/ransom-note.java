
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> s = new HashMap<>();
        int i = 0;
        while (i < magazine.length()) {
            char ch = magazine.charAt(i);
            s.put(ch, s.getOrDefault(ch, 0) + 1);
            i++;
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            char ch = ransomNote.charAt(j);
            if (!s.containsKey(ch) || s.get(ch) == 0)
                return false;
            s.put(ch, s.get(ch) - 1);
        }
        return true;
    }
}
