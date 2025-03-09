class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int alternatingLength = 1;

        for (int i = 0; i < n + k - 1; i++) {
            if (colors[i % n] == colors[(i - 1 + n) % n]) {
                alternatingLength = 1;
            } else {
                alternatingLength++;
            }

            if (i >= k - 1 && alternatingLength >= k) {
                count++;
            }
        }

        return count;
    }
}
