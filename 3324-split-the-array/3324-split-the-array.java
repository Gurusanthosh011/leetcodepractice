class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();


        for(int num:nums){
            h1.put(num,h1.getOrDefault(num,0)+1);
            if(h1.get(num)>2){
                return false;
            }

        }
        return true;
        
    }
}