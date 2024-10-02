class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] l1=new int[2];

        int i1=0;
        int i2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                l1[0]=i;
                l1[1]=j;
            }

        }
        }
        return l1;
        
     
        
        
    }
}