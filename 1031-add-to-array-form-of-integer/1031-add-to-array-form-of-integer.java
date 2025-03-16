import java.math.BigInteger; 
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l1=new ArrayList<>();
        StringBuilder res=new StringBuilder();
        for(int c:num){
            res.append(c);
        }
           // int r=Integer.ParseInt(res.toString());
           BigInteger bigNum = new BigInteger(res.toString());
        bigNum = bigNum.add(BigInteger.valueOf(k));
           String a=bigNum.toString();
           for(int i=0;i<a.length();i++){
            int digit=a.charAt(i)-'0';
            l1.add(digit);

           }
           return l1;
        
    }
}