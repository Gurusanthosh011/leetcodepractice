class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
        int result=0;
        for(int num:h1.keySet()){
            if(h1.get(num)==2){
                result ^=num;

            }
        }
        return result;
        
    }
}