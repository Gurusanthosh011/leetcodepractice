class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] s1=sentence.split(" ");
        int k=s1.length;
        
            for(int i=0;i<s1.length-1;i++){
                int h=s1[i].length();
                char ch=s1[i].charAt(h-1);
                char ch1=s1[i+1].charAt(0);
                if(ch!=ch1){
                    return false;
                }
                 }
       
       return  s1[k-1].charAt(s1[k-1].length()-1)==s1[0].charAt(0);
        
    }
    }