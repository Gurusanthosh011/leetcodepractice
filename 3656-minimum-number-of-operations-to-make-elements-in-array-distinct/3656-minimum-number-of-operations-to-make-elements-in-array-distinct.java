import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            h1.put(nums[i], h1.getOrDefault(nums[i], 0) + 1);
        }

        if (h1.size() == nums.length) {
            return 0;
        }

        int i = 0;
        int count = 0;

        while (i < nums.length) {
            int removeCount = Math.min(3, nums.length - i);

            for (int j = 0; j < removeCount; j++) {
                int key = nums[i + j];
                int val = h1.get(key) - 1;

                if (val <= 0) {
                    h1.remove(key);
                } else {
                    h1.put(key, val);
                }
            }

            count++;
            i += removeCount;

            if (h1.size() == nums.length - i) {
                break;
            }
        }

        return count;
    }
}
