class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> s1=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            s1.add(nums[i]);
        }
        int count=0;
        int n=nums.length;
       
        for(int i=0;i<n;i++){
            Set<Integer> s2=new HashSet<>();
            for(int j=i;j<n;j++){
               
                    s2.add(nums[j]);
            
            if(s1.size()==s2.size()){
                count+=1;
            }}
        }
        return count;
        
    }
}