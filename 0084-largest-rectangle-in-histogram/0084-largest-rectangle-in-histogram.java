class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s1.isEmpty()&&heights[s1.peek()]>=heights[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=s1.peek();

            }
            s1.push(i);
        }

    s1.clear();

        
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty()&&heights[s1.peek()]>=heights[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nse[i]=n;
            }
            else{
                nse[i]=s1.peek();

            }
            s1.push(i);
        }


        int max=0;
        for(int i=0;i<n;i++){
           int width=nse[i]-pse[i]-1;
           int area=heights[i]*width;
           max=Math.max(area,max);

        }
        return max;
        
    }
}