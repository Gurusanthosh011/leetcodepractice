class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int[] res=new int[n*m];
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[index]=grid[i][j];
                index+=1;
            }
        }
        Arrays.sort(res);
        int median=res[res.length/2];
        int count=0;
        for(int i=0;i<res.length;i++){
            int data=Math.abs(median-res[i]);
            if(data%x!=0){
                return -1;
            }
            else{
                count+=data/x;
            }
        }
        return count;

    }
}