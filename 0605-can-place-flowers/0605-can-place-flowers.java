class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Brute force Solution
        // ArrayList<Integer> flower = new ArrayList<>();
        // flower.add(0);
        // for (int f : flowerbed) {
        //     flower.add(f);
        // }
        // flower.add(0);
        // int l = flower.size();
        // for (int i = 1; i < l - 1; i ++) {
        //     if (flower.get(i - 1) == 0 && flower.get(i) == 0 && flower.get(i + 1) == 0) {
        //         flower.set(i, 1);
        //         n --;
        //     }
        // }
        // return n <= 0;
        
        // Optimal solution:
        // If no flowers need to be planted, return true
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty.
            if (flowerbed[i] == 0) {
                // Check if the left and right plots are empty.
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                
                // If both plots are empty, we can plant a flower here.
                if (emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
        
    }
}