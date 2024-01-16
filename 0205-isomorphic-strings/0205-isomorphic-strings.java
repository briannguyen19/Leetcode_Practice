class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedT = new HashSet<>();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (mappedT.contains(t.charAt(i))) {
                    return false; // THis case: S= 'ab', t = 'aa', we prevent there are more than one t mapped to s
                }
                map.put(s.charAt(i), t.charAt(i));
                mappedT.add(t.charAt(i));
            }
            
        } 
        return true;
    }
}