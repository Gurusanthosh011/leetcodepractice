class Solution {
    public void sortColors(int[] nums) {
       int index=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            index++;
        }
       }
       for(int i=index;i<nums.length;i++){
        if(nums[i]==1){
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            index++;
        }
       }
       for(int i=index;i<nums.length;i++){
         nums[i]=2;
       }
      
        
    }
}