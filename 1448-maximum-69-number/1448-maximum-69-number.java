class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
        StringBuilder b1=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='6'){
                b1.setCharAt(i,'9');
                break;

                
            }
        }
        return Integer.valueOf(b1.toString());
        
    }
}