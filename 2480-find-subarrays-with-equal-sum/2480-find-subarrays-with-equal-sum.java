class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> s1= new HashSet<>();
        
        for(int i=0;i<nums.length-1;i++){
            int sum=nums[i]+nums[i+1];
            if(s1.contains(sum)){
                return true;
            }
            s1.add(sum);
        }
        return false;
        
    }
}