class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int total=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> h1=new HashMap<>();
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                h1.put(c,h1.getOrDefault(c,0)+1);
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int freq:h1.values()){
                    min=Math.min(freq,min);
                    max=Math.max(max,freq);
                }
                total+=(max-min);
            }
        }
        return total;
    }
}