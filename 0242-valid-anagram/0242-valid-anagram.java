class Solution {
    public boolean isAnagram(String s, String t) {
        int s_length = s.length();
        int t_length = t.length();
        
        // # If the length is different: 
        if (s_length != t_length) {
            return false;   
        }
        
        // # Create the count table
        int[] count_table = new int[26];
        
        // # Count the frequency
        for (int i = 0; i < s_length; i++) {
            count_table[s.charAt(i) - 'a'] ++;
        }
        
        for (int j = 0; j < t_length; j++) {
            count_table[t.charAt(j) - 'a']--;
            if (count_table[t.charAt(j) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}