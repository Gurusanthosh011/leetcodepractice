class Solution {
    public int maximumSum(int[] nums) {
      
      int max=-1;
      HashMap<Integer,Integer> h1=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int sum=0;
        while(n>0){
          int r=n%10;
          sum+=r;
          n=n/10;
        }
       
        
        if(h1.containsKey(sum)){
            max=Math.max(max,nums[i]+h1.get(sum));
            h1.put(sum, Math.max(h1.get(sum), nums[i]));
            }
            else{
                h1.put(sum,nums[i]);
            }}
            return max;

            
    }
}