class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0; // At least 3 elements needed

        int[] lmax = new int[n]; // Stores max before index j
        int[] rmax = new int[n]; // Stores max after index j

        // Compute left max (before index j)
        int lm = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            lmax[i] = lm;  // Store max before index i
            lm = Math.max(lm, nums[i]);  // Update left max
        }

        // Compute right max (after index j)
        int rm = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            rmax[i] = rm;  // Store max after index i
            rm = Math.max(rm, nums[i]);  // Update right max
        }

        long maxValue = 0;
        for (int j = 1; j < n - 1; j++) { // j is middle element
            if (lmax[j] > nums[j] && rmax[j] > 0) { // Ensure valid triplet
                maxValue = Math.max(maxValue, (long)(lmax[j] - nums[j]) * rmax[j]);
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {12,6,1,2,7};
        System.out.println(obj.maximumTripletValue(nums)); // Output: 77 ✅
    }
}
