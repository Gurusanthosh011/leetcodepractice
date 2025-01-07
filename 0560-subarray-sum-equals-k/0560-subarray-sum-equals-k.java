class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Integer,Integer> h1=new HashMap<>();
         int sum=0;
         int count=0;
         h1.put(0,1);
         for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(h1.containsKey(sum-k)){
                count+=h1.get(sum-k);
            }
            h1.put(sum,h1.getOrDefault(sum,0)+1);
         }
         return count;

          
    }
}