class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String res = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (String ele : strs) {
                if (i >= ele.length() || ele.charAt(i) != currentChar) {
                    return res;
                }
            }
            res += currentChar;
        }
        return res;
    }
}
