class Solution {
    public boolean isPowerOfThree(int n) {
        int k=Math.abs(n);
        if(n<=0){
            return false;
        }
        while(k%3==0){
            k=k/3;
            System.out.println(k);
        }

        if(k==1){
            return true;
        }
        return false;
        
    }
}