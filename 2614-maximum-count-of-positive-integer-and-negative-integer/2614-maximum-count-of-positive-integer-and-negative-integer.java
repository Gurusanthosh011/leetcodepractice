class Solution {
   
        public int firstPositiveIndex(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                right = mid - 1; // Move left
            } else {
                left = mid + 1; // Move right
            }
        }
        return left; // First positive index
    }

    // Binary search to find the first index of a non-negative number (>= 0)
    public int firstNonNegativeIndex(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= 0) {
                right = mid - 1; // Move left
            } else {
                left = mid + 1; // Move right
            }
        }
        return left; // First non-negative index
    }

    public int maximumCount(int[] nums) {
        int firstPositive = firstPositiveIndex(nums);
        int firstNonNegative = firstNonNegativeIndex(nums);

        int positiveCount = nums.length - firstPositive;
        int negativeCount = firstNonNegative;

        return Math.max(positiveCount, negativeCount);
    }
    
}