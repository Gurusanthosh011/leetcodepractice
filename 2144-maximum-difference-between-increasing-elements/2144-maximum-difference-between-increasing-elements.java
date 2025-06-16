class Solution {
    public int maximumDifference(int[] nums) {
         int max=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length;j++){
                if(i<j&&nums[i]<nums[j]){
                int k=Math.abs(nums[i]-nums[j]);
                max=Math.max(max,k);
                }

            }
        }
        return max;
        
    }
}