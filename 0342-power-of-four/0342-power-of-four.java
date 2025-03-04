class Solution {
    public boolean isPowerOfFour(int n) {
         if (n <= 0) return false;
         int k=n;
        while(k%4==0){
            k=k/4;


        }
        return k==1;
    }
}