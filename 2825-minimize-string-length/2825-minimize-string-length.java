class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> s1=new HashSet<>();
        for(char c:s.toCharArray()){
            s1.add(c);
        }
        return s1.size();
    }
}