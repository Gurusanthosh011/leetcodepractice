class Solution {
    public char findTheDifference(String s, String t) {
        int sums=0,sumt=0;
        for(char c:s.toCharArray()){
            sums+=c;
        }
        for(char c:t.toCharArray()){
            sumt+=c;
        }
        return (char)(sumt-sums);
    }
}