class Solution {
    public String reverseWords(String s) {
        
        String[] s2=s.trim().split("\\s+");
        int n=s2.length;
        for(int i=0;i<n/2;i++){
            String str=s2[i];
            s2[i]=s2[n-i-1];
            s2[n-i-1]=str;
        }
        String result=String.join(" ",s2);
        return result;
        
    }
}