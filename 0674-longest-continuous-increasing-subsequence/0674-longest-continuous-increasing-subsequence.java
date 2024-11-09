class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        if(n==1){
            return 1;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count+=1;
                max=Math.max(max,count);
            }
            else{
                count=1;
                max=Math.max(max,count);
            }
        }
        return max;
        
    }
}