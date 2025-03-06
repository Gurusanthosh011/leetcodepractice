class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] arr=new int[m*n];
        int[] res=new int[2];
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[index]=grid[i][j];
                index++;

            }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                res[0]=arr[i];
                break;
            }

        }
        int sum=0;
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!s1.contains(arr[i])){
            s1.add(arr[i]);
            sum+=arr[i];
            }

        }
        int k=arr.length;
        int r= ((k * (k + 1)) / 2) - sum;
//(k*((k+1)/2))-sum;
        res[1]=r;
        return res;
        
    }
}