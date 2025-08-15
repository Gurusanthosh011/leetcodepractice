class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        n=n-3;
        String res="";
        for(int i=0;i<=n;i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)&&res.length()==0){
                res+=num.charAt(i);
                res+=num.charAt(i+1);
                res+=num.charAt(i+2);
            }
            String p=num.substring(i,i+3);
            int p1=Integer.valueOf(p);
            int q=0;
            if(res.length()>0){
            q=Integer.valueOf(res);}
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)&&p1>q){
                res=p;
            }
        }
        return res;
        
    }
}