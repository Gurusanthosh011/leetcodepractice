class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){

        
        if(c=='('||c=='{'||c=='['){
            s1.push(c);
        }
        else{
            if(s1.isEmpty()) return false;
            
            char o=s1.pop();
            if((c==')'&&o!='(')||
            (c=='}'&&o!='{')||
            (c==']'&&o!='[')){
                return false;
            }
        }}
        return s1.isEmpty();
    }
}