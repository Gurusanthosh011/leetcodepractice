class Solution {
    public int trap(int[] height) {
        int n = height.length;
       
       int res=0;
       int[] leftmax=new int[n];
       int[] rightmax=new int[n];
       leftmax[0]=height[0];
       for(int i=1;i<n;i++){
        leftmax[i]=Math.max(leftmax[i-1],height[i]);
}
rightmax[n-1]=height[n-1];
 for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(rightmax[i+1],height[i]);
}
for(int i=0;i<n;i++){
res+=Math.min(rightmax[i],leftmax[i])-height[i];
}
return res;

    }
}