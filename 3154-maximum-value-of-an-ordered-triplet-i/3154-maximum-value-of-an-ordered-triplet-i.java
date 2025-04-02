class Solution {
    public long maximumTripletValue(int[] nums) {
         long max=0;
         int n=nums.length;
         int[] lmax=new int[n];
         int[] rmax=new int[n];
         int lm=0;
         if(n<3){
            return 0;
         }
         for(int i=0;i<n;i++){
            lmax[i]=lm;
            if(lm<nums[i]){
                lm=nums[i];
            }
            
         }
         int rm=0;
         for(int i=n-1;i>=0;i--){
            rmax[i]=rm;
            if(rm<nums[i]){
                rm=nums[i];
            }
          
         }
         for(int i=1;i<n-1;i++){
            if(lmax[i]>nums[i]&&rmax[i]>0){
                max= Math.max(max, (long)(lmax[i] - nums[i]) * rmax[i]);
            }
         }
         return max;
    }
}