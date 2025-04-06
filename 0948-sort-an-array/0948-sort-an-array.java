class Solution {
    public int[] sortArray(int[] nums) {
        int low=0;
        int high=nums.length-1;
        mergesort(nums,low,high);
        return nums;
        
    }
   public static void  mergesort(int[] nums,int low, int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
     }
    public static  void merge(int[] nums,int low,int mid,int high){
        List<Integer> l1=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(nums[left]<nums[right]){
                l1.add(nums[left]);
                left++;
            }
            else{
                l1.add(nums[right]);
                right++;

            }}
            while(left<=mid){
                l1.add(nums[left]);
                left++;

            }
            while(right<=high){
                l1.add(nums[right]);
                right++;
            }
            int m=0;
            for(int i=low;i<=high;i++){
                nums[i]=l1.get(m);
                m++;
            }
        
        
     }
}