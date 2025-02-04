class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0;
        sum+=nums[0];
        int max=Integer.MIN_VALUE;
        max=Math.max(sum,max);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
                max=Math.max(sum,max);
            }
            else{
                sum=0;
                sum+=nums[i];
                max=Math.max(sum,max);
            }
        }
        return max;
        
    }
}