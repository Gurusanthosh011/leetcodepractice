class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
    for(int i=0;i<nums.size();i++){
        for(int j=i+1;j<nums.size();j++){
            if((nums.get(i)+nums.get(j))<target){

                 count+=1;
            }
        }
    }
    return count;
    }
}