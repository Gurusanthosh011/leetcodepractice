class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
       for(int i=low;i<=high;i++ ){
        String s=Integer.toString(i);
        if(s.length()%2==0){
            int sum1=0;int sum2=0;
            for(int k=0;k<s.length()/2;k++){
               int  val=s.charAt(k)-'0';
               int val2=s.charAt(s.length()-1-k)-'0';
               sum1+=val;
               sum2+=val2;

            }
            if(sum1==sum2){
                count+=1;
            }
        }
       }
       return count;
    }
}