/*class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] s1=sentence.split(" ");
        int k=s1.length;
        if(s1.length==1){
            int n=s1[0].length();
            char c1=s1[0].charAt(0);
            char c2=s1[0].charAt(n-1);
            if(c1==c2){
                return true;
            }
            }
            for(int i=0;i<s1.length-1;i++){
                int h=s1[i].length();
                char ch=s1[i].charAt(h-1);
                char ch1=s1[i+1].charAt(0);
                if(ch!=ch1){
                    return false;
                }
                 }
       char c1=s1[k-1].charAt(s1[k-1].length()-1);
       char c2=s1[0].charAt(0);
       return c1==c2;
        
    }
    }*/
    class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] s1 = sentence.split(" ");
        int k = s1.length;

        // Case where there is only one word
        if (k == 1) {
            int n = s1[0].length();
            return s1[0].charAt(0) == s1[0].charAt(n - 1);
        }

        // Loop through each word to check circular condition
        for (int i = 0; i < k - 1; i++) {
            int h = s1[i].length();
            char ch = s1[i].charAt(h - 1);     // Last character of the current word
            char ch1 = s1[i + 1].charAt(0);    // First character of the next word
            
            // Return false immediately if any pair of words does not match
            if (ch != ch1) {
                return false;
            }
        }

        // Final check: last character of the last word matches the first character of the first word
        return s1[k - 1].charAt(s1[k - 1].length() - 1) == s1[0].charAt(0);
    }
}


