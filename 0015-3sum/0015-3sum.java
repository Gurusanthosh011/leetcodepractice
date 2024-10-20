class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> l1=new LinkedHashSet<>();
       for(int i=0;i<nums.length-1;i++){
        Set<Integer> s1=new HashSet<>();
        for(int j=i+1;j<nums.length;j++){
            int third=-(nums[i]+nums[j]);
            if(s1.contains(third)){
                List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                Collections.sort(temp);
                l1.add(temp);
            }
            s1.add(nums[j]);
        }
       }
       return new ArrayList<>(l1);
        
    }
}