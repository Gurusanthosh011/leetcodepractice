class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> l1=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            l1.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                l1.get(graph[i][j]).add(i);

            }
        }
        List<Integer> res=new ArrayList<>();
        int[] indegree=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int nig:l1.get(i)){
                indegree[nig]++;
            }
        }
        
        Queue<Integer> q1=new LinkedList<>();

        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q1.add(i);
            }
        }

        while(!q1.isEmpty()){
            int r=q1.poll();
            res.add(r);
            for(int nig:l1.get(r)){
                indegree[nig]--;
                if(indegree[nig]==0){
                    q1.add(nig);
                }
            }
        }

        Collections.sort(res);
        return res;
    }
}