class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e1:h1.entrySet()){
            if(e1.getValue()%2!=0){
                return false;
            }
        }
        return true;
        
    }
}