import java.util.*;

class Solution {
    public int subsetXORSum(int[] nums) {
        final int MOD = 10000007;
        int n = nums.length;
        List<Integer> l1 = new ArrayList<>();

       
        for (int i = 0; i < (1 << n); i++) { 
            int sum = 0;
            for (int j = 0; j < n; j++) {
               
                if ((i & (1 << j)) != 0) {
                    sum ^= nums[j];
                }
            }
            l1.add(sum);
        }

        int res = 0;
        for (int i = 0; i < l1.size(); i++) {
            res = (res + l1.get(i));
        }

        return res;
    }
}
