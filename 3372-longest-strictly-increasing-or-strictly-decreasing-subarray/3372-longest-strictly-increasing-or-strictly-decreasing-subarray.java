class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                c+=1;
                max=Math.max(c,max);
            }
            else{
                c=1;
            }
        }
        c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                c+=1;
                max=Math.max(c,max);
            }
            else{
                c=1;
            }
        }
        return max;
        
    }
}