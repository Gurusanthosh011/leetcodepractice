class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> en:h1.entrySet()){
            if(en.getValue()>1){
                l1.add(en.getKey());
            }
        }
        return l1;
        
    }
}