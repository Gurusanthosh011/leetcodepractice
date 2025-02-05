class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n!=m){
            return false;
        }
        int count=0;
       int t=-1;
       int g=-1;
       for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            if(t==-1){
                t=i;
            }
            g=i;
            count+=1;
        }
       }
       if(count==0){
        return true;
       }
       if(count==2){
        if(s1.charAt(t)==s2.charAt(g)&&s1.charAt(g)==s2.charAt(t)){
        return true;}
       }
       return false;
    }
}