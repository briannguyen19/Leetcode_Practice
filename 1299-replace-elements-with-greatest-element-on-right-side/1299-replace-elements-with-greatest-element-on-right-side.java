class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length; 
        int max = -1;
        
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                int tmp = max;
                    max = arr[i];
                    arr[i] = tmp;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}