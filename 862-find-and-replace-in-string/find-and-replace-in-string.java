import java.util.*;

class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

      
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            String src = sources[i];

            if (s.startsWith(src, idx)) {
                map.put(idx, i);
            }
        }

        
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (map.containsKey(i)) {
                int repIndex = map.get(i);
                result.append(targets[repIndex]);
                i += sources[repIndex].length();
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
