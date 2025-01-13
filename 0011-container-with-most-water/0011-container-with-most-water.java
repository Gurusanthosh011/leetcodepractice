class Solution {
    public int maxArea(int[] height) {
        
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
               int w=j-i;
                int ht=Math.min(height[i],height[j]);
                int mst=w*ht;
                max=Math.max(mst,max);
                 if(height[i]<height[j]){
                     i++;
                 }
                 else{
                     j--;
                 }
            }
        
        return max;
    }
  
}