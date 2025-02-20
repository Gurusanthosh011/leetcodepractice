class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Set<Integer> h1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h1.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!h1.contains(i+1)){
                res.add(i+1);

            }
        }
        Collections.sort(res);
        return res;
        
    }
}