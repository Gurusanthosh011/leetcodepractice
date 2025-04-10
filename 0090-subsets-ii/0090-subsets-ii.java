class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int index=0;

        sub(l1,l2,index,nums);
        return l1;
        
    }
   public static void sub(List<List<Integer>> l1,List<Integer> l2, int index,int[] nums){
        if(index>=nums.length){
            l1.add(new ArrayList<>(l2));
            return;

        }
        l2.add(nums[index]);
        sub(l1,l2,index+1,nums);
        l2.remove(l2.size()-1);
        int nextIndex = index + 1;
        while (nextIndex < nums.length && nums[nextIndex] == nums[index]) {
            nextIndex++;
        }
 
        sub(l1, l2, nextIndex, nums);
         
        
    }

  


}