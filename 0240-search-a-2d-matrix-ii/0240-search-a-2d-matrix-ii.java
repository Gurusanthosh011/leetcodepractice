class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int n=matrix.length;
        int m=matrix[0].length;
        int[] arr=new int[n*m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k++]=matrix[i][j];
            }
            
        }
        Arrays.sort(arr);
        int low=0;
        int high=n*m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}