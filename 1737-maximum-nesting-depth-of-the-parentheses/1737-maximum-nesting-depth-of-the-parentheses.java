class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int depth = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
                depth = Math.max(depth, count);
            }
            else if(s.charAt(i)==')' && count>0){
                count--;
            }
        }
        return depth;
    }
}