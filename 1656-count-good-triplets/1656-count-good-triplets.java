class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                   int l=Math.abs(arr[i]-arr[j]);
                   int h=Math.abs(arr[j]-arr[k]);
                   int o=Math.abs(arr[i]-arr[k]);
                   if(l<=a&&h<=b&&o<=c){
                    count+=1;
                   }
                }
            }
        }
        return count;
        
    }
}