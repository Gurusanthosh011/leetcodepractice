class Solution {
    public int numberOfSubstrings(String s) { 
        int count=0;
        int left=0;
        int n=s.length();
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
            while(h1.size()==3){
                count+=n-i;

                h1.put(s.charAt(left),h1.getOrDefault(s.charAt(left),0)-1);
                if(h1.get(s.charAt(left))==0){
                    h1.remove(s.charAt(left));

                }
                left++;
            }
        }
        return count;

    }
}