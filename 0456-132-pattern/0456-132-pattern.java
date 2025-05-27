class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> s1=new Stack<>();
        int n=nums.length;
        int second=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<second){
                return true;
            }
            while(!s1.isEmpty()&&nums[i]>s1.peek()){

                        second=s1.pop();

            }
            s1.add(nums[i]);
        }
        return false;
        
    }
}