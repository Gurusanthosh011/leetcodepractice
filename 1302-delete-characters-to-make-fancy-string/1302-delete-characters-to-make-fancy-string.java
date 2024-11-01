class Solution {
    public String makeFancyString(String s) {
      StringBuilder b1=new StringBuilder();
      int count=1;
      b1.append(s.charAt(0));
      for(int i=1;i<s.length();i++){
        if(s.charAt(i)==s.charAt(i-1)){
            count+=1;
        }
        else{
            count=1;
        }
        if(count<=2){
            b1.append(s.charAt(i));
        }
      }
      return b1.toString();
    }
}