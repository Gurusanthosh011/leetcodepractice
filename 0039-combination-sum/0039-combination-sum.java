class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

       
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        
        com(0,candidates,target,l1,l2);
        return l1;
        
    }

    public void com(int index,int[] candidates,int target,List<List<Integer>> l1,List<Integer> l2){
        if(target==0){
            l1.add(new ArrayList<>(l2));
            return;
        }
        if(index==candidates.length||target<0){
            return;
        }

        l2.add(candidates[index]);
        com(index,candidates,target-candidates[index],l1,l2);
        l2.remove(l2.size()-1);
         com(index+1,candidates,target,l1,l2);


    }
}