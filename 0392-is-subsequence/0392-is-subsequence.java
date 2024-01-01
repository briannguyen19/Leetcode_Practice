class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true; // An empty string is a subsequence of any string
        }

        int indexS = 0, indexT = 0;

        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++; // Move to the next character in s
                if (indexS == s.length()) {
                    return true; // All characters of s have been found in t in the correct order
                }
            }
            indexT++; // Move to the next character in t
        }

        return false;
    }
}