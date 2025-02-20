class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(!h1.containsKey(i+1)){
                res.add(i+1);

            }
        }
        Collections.sort(res);
        return res;
        
    }
}