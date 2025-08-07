class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] col=new int[n];
        Arrays.fill(col,-1);
        for(int i=0;i<n;i++){
            if(col[i]!=-1){
                continue;
            }
            Queue<Integer> q1=new LinkedList<>();
            col[i]=0;
            q1.add(i);
            while(!q1.isEmpty()){
                int node=q1.poll();
                for(int nei:graph[node]){
                    if(col[nei]==-1){
                        col[nei]=1-col[node];
                        q1.add(nei);
                    }
                    else if(col[nei]==col[node]){
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}