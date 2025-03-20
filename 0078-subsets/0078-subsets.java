class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1=new ArrayList<>();
        
        int n=nums.length;
        int total=1<<n;
        
        for(int i=0;i<total;i++){
            List<Integer> l5=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                
               if((i&(1<<j))!=0){
                l5.add(nums[j]);
               }
                
            }
             l1.add(l5);
        }
        return l1;
    }
}