class Solution {
    public int countServers(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;


        int[] rowc=new int[row];
        int[] colc=new int[col];


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    rowc[i]++;
                    colc[j]++;
                }
            }
        }

         int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1&&(rowc[i]>1||colc[j]>1)){
                    count+=1;
                }
            }
        }
        return count;
    }
}