class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int max = 0;
        int count = 0;

        int type1 = -1;
        int type2 = -1;
        int lastFruit = -1;
        int lastFruitCount = 0;

        for (int i = 0; i < n; i++) {
            int current = fruits[i];

            if (current == type1 || current == type2) {
                count++;
            } else {
                count = lastFruitCount + 1;
            }

            if (current == lastFruit) {
                lastFruitCount++;
            } else {
                lastFruitCount = 1;
            }

            if (current != type1 && current != type2) {
                type1 = lastFruit;
                type2 = current;
            }

            lastFruit = current;
            max = Math.max(max, count);
        }

        return max;
    }
}
