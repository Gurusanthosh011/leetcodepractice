class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> s2=new Stack<>();
       for(char c:s.toCharArray()){
        if(!s2.isEmpty()&&s2.peek()==c){
            s2.pop();
        }
        else{
            s2.push(c);
        } }
        StringBuilder s1=new StringBuilder();
        for(char c:s2){
            s1.append(c);
        }
        return s1.toString();
       
    }
}