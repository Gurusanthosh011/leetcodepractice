class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] r=new int[right+1];
        Arrays.fill(r,1);
        r[0] = r[1] = 0;
        for(int i=2;i*i<=right;i++){
            if(r[i]==1){
                for(int j=i*i;j<=right;j+=i){
                        r[j]=0;
                }
            }
        }
        int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        List<Integer> l1=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(r[i]==1){
                l1.add(i);
            }
        }
        if(l1.size()<2){
            return res;
        }
        int in=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l1.size()-1;i++){
            if(min>l1.get(i+1)-l1.get(i)){
                min=l1.get(i+1)-l1.get(i);
                in=i;
            }

        }
        res[0]=l1.get(in);
        res[1]=l1.get(in+1);
        return res;
        
    }
}