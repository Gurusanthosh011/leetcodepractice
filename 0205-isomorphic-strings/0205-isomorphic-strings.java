/*import java.util.*;
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
}*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If lengths differ, they can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Create two HashMaps for bidirectional mapping
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        // Loop through characters of both strings
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // If there's already a mapping for s -> t, check if it matches the current character in t
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;
                }
            }
            // If there's already a mapping for t -> s, check if it matches the current character in s
            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    return false;
                }
            }

            // Otherwise, create new mappings in both directions
            mapS.put(charS, charT);
            mapT.put(charT, charS);
        }

        return true;
    }
}
