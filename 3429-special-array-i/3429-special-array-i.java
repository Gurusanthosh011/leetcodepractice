class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==nums[i-1]%2){
                return false;
            }

        }
        return  true;
    }
}