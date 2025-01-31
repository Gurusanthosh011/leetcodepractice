class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(j<nums2.length){
                if(nums1[i]==nums2[j]){
                    break;

                }
                j++;
            }
            ans[i]=-1;
            if(j<nums2.length){
                for(j=j+1;j<nums2.length;j++){
                    if(nums1[i]<nums2[j]){
                       ans[i]=nums2[j];
                       
                       break;
                    }
                }}
               
            
        }
        return ans;
    }
}