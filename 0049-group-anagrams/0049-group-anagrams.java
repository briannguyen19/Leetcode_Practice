class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray(); 
            Arrays.sort(chars);
            String sortString = new String(chars);
            if (!map.containsKey(sortString)) {
                map.put(sortString, new ArrayList<>());
            }
            map.get(sortString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}