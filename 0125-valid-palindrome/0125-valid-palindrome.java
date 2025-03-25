class Solution {
    public boolean isPalindrome(String s) {
     StringBuilder str=new StringBuilder();
     for(int i=0;i<s.length();i++){
        char t=s.charAt(i);
        if(Character.isLetterOrDigit(t))
        str.append(Character.toLowerCase(t));
     }
      int k=str.length();
       if(k==0){
        return true;
       }
       int h=0;
       
       return rev(str,h,k);}
       public  boolean rev(StringBuilder str,int h,int k){
        if(h>=k/2){
            return true;

        }
       if(str.charAt(h)!=str.charAt(k-h-1)){
        return false;
       }
      return rev(str,h+1,k);


       }
       
    
}