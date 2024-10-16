class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s1=new StringBuilder();
        while(columnNumber>0){
            columnNumber= columnNumber-1;
            int rem= columnNumber%26;
            s1.append((char)(rem+'A'));
             columnNumber/=26;
        }
        return s1.reverse().toString();
        
    }
}