class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
         int low = 0, high = nums.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (nums[mid] == target) {
                return mid;  // Target found
            } else if (nums[mid] < target) {
                low = mid + 1;  // Search right half
            } else {
                high = mid - 1;  // Search left half
            }
        }
        
        // If target is not found, return the insertion point (low)
        return low;
        
    }
}