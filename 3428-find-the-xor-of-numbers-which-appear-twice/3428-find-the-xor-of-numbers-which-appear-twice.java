class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0)
            continue;
            int k=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    nums[j]=0;
                    k++;
                    break;
                }
            }
            if(k==1)
            x=x^nums[i];
        }
        return x;
    }
}