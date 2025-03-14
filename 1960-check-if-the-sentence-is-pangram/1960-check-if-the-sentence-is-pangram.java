class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            h1.put(c,h1.getOrDefault(c,0)+1);

        }
        if(h1.size()==26){

            return true;
        }
        return false;
    }
}