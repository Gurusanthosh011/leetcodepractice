class Solution {
    public int[] findOrder(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int i=0;i<V;i++){
            l1.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            l1.get(edges[i][1]).add(edges[i][0]);
        }
        
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int nig:l1.get(i)){
                indegree[nig]+=1;
            }
        }
        
        Queue<Integer> q1=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q1.add(i);
            }
        }
        
        while(!q1.isEmpty()){
           int k=q1.poll();
           l2.add(k);
           for(int nig:l1.get(k)){
               indegree[nig]-=1;
               if(indegree[nig]==0){
                   q1.add(nig);
               }
           }
        }
        if (l2.size() != V) {
            return new int[0];
        }
        
       int[] res=new int[l2.size()];
       for(int i=0;i<l2.size();i++){
        res[i]=l2.get(i);
       }
       return res;
        
    }
}