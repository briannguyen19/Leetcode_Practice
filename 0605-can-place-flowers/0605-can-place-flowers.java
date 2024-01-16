class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        ArrayList<Integer> flower = new ArrayList<>();
        flower.add(0);
        for (int f : flowerbed) {
            flower.add(f);
        }
        flower.add(0);
        int l = flower.size();
        for (int i = 1; i < l - 1; i ++) {
            if (flower.get(i - 1) == 0 && flower.get(i) == 0 && flower.get(i + 1) == 0) {
                flower.set(i, 1);
                n --;
            }
        }
        return n <= 0;
    }
}