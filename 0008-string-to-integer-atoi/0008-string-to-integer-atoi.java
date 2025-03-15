class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int res=0;
        int i=0;
        int sign=1;
        while(i<n&&s.charAt(i)==' '){
            i++;
        }
        if(i<n&&(s.charAt(i)=='-'||s.charAt(i)=='+')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }

        while(i<n&&Character.isDigit(s.charAt(i))){
            int d=s.charAt(i)-'0';
 if (res> (Integer.MAX_VALUE - d) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res=res*10+d;
            i++;
        }
        return res*sign;

        
    }
}