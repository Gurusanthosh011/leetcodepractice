class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> l1=new ArrayList<>();
        int k=n;

        while(k>0){
            int i=0;
            while(Math.pow(2,i)<=k){
                i++;

            }
            i--;
           int power = (int) Math.pow(2, i);

            l1.add(power);
            k -= power;

        }
        Collections.sort(l1);
          int mod = (int) 1e9 + 7;
         int[] res=new int[queries.length];
       for(int i=0;i<queries.length;i++){
        long sum=1;
        int n1=queries[i][0];
        int m=queries[i][1];
        for(int j=n1;j<=m;j++){
            sum=(sum*(long)l1.get(j))%mod;
        }
       res[i] = (int)sum;


       }
       
        return res;
        
    }
}