class Solution {
    public int[] getConcatenation(int[] nums) {
        int l1 = nums.length;
        int []res = new int[2 * l1];
        int j = l1;
        for (int i = 0; i < l1; i++) {
            res[i] = nums[i];
            res[i + l1] = nums[i];
            j += 1;
        }
        return res;
    }
}