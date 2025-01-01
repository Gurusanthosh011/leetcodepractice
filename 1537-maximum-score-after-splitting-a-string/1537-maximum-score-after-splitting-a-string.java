class Solution {
    public int maxScore(String s) {
        int n = s.length();
        if (n == 1) {
            return 1;
        }

        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder();
        
        // Add the first character to s2, and delete it from s1
        s2.append(s1.charAt(0));
        s1.deleteCharAt(0);

        int max = 0;
        
        while (s1.length() > 0) {
            // First loop: count zeros in s2
            int count2 = 0;
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == '0') {
                    count2++;
                }
            }

            // Second loop: count ones in s1
            int count1 = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == '1') {
                    count1++;
                }
            }

            // Move the first character from s1 to s2
            s2.append(s1.charAt(0));
            s1.deleteCharAt(0);

            // Calculate the score and update max
            int res = count1 + count2;
            max = Math.max(res, max);
        }

        return max;
    }
}
