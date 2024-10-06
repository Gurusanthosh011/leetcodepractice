class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> h1= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
        int k=-1;
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(i)){
                if(h1.get(i)>1){
                    k=i;

                }
            }
        }
        return k;
        
    }
}