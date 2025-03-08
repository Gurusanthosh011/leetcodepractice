class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        int n=blocks.length();
        int win=n-k;
        for(int i=0;i<=win;i++){
            int j=0;
            int count=0;
            while(j<k){
                if(blocks.charAt(i+j)=='W')
                {
                    count+=1;
                    
                }
                j++;
            }
            min=Math.min(count,min);

        }
        return min;

        
    }
}