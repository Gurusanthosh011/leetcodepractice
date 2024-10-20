class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>  m1=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(m1.containsKey(c)){
                m1.put(c,m1.get(c)+1);
            }
            else{
                m1.put(c,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(m1.containsKey(c)){
                m1.put(c,m1.get(c)-1);
                if(m1.get(c)==0){
                    m1.remove(c);
                }
            }
            else{
                return false;
            }
        }
            return m1.isEmpty();
        
    }
}