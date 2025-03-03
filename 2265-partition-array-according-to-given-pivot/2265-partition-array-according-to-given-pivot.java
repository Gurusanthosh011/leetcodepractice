class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result1=new int[nums.length];
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                result[i]=0;

            }
             if(nums[i]==pivot){
                result[i]=1;
                
            }
             if(nums[i]>pivot){
                result[i]=2;
                
            }
        }
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(result[i]==0){
                result1[index]=nums[i];
                index+=1;
            }
        }
         for(int i=0;i<nums.length;i++){
            if(result[i]==1){
                result1[index]=nums[i];
                index+=1;
            }
        }
         for(int i=0;i<nums.length;i++){
            if(result[i]==2){
                result1[index]=nums[i];
                index+=1;
            }
        }
        return result1;
    }
}