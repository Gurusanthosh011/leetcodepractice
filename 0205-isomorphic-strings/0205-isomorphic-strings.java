import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> h1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            char l=t.charAt(i);
            if(h1.containsKey(k)){
                if(h1.get(k)!=l){
                    return false;
                }
            }
            else if(h1.containsValue(l)){
                return false;
            }
            h1.put(k,l);

        }
        return true;
        
    }
}
