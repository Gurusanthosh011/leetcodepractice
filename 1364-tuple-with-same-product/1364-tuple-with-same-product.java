class Solution {
    public int tupleSameProduct(int[] nums) {
        
        int count=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int pd=nums[i]*nums[j];
                 h1.put(pd,h1.getOrDefault(pd,0)+1);
            }
        }
        for(int n:h1.values()){
            if(n>1){
                count+=(n*(n-1))/2;
            }
        }
        return count*8;

    }
}