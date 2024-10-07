class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s1=new HashSet<>();
        while(n!=1 && !s1.contains(n)){
            s1.add(n);
            n=getsumofsq(n);
        }
        return n==1;
    }
        public int getsumofsq( int n){
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
            return sum;
        }
        
    
}