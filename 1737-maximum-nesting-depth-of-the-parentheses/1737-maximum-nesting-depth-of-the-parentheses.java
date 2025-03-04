class Solution {
    public int maxDepth(String s) {
        int count =0;
        int max=0;
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                s1.push(c);
                count+=1;
                max=Math.max(max,count);
            }
            if(c==')'){
                s1.pop();
                count-=1;
                max=Math.max(max,count);
            }
        }
return max;
        
    }
}