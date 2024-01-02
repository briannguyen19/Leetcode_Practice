class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.length();
        int count = 0; // This will hold the length of the last word.

        // We start from the end of the string and move backwards.
        for (int i = length - 1; i >= 0; i--) {
            // If we have found the last word, and encounter a space,
            // this means we've reached the start of the last word.
            if (s.charAt(i) == ' ' && count > 0) {
                break;
            }
            // If it is not a space, increment the count.
            if (s.charAt(i) != ' ') {
                count++;
            }
        }

        return count; // Return the length of the last word.
    }
}
