class Solution {
    public String clearDigits(String s) {
        Stack<Character> s1= new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)&&!s1.isEmpty()){
                 s1.pop();

            }
            else{
                s1.push(c);
            }
        }
      StringBuilder result=new StringBuilder();
      for(char c:s1){
        result.append(c);
      }
       return result.toString();
    }
}