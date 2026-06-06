class Solution {
    public int spanningTree(int V, int[][] edges) {
        //Prim's Algorithm
        if(V<=0) return -1;
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        
        for(int[] edge: edges)
        {
            int u = edge[0];
            int v = edge[1];
            int w =  edge[2];
            
            for(int i=0; i<V; i++)
             {
                   adj.add(new ArrayList<>());
              }
            adj.get(u).add(new int[] {v,w});
            adj.get(v).add(new int[] {u,w});
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        
        pq.offer(new int[] {0,0});
        int mst = 0;
        boolean[] visited = new boolean[V];
        
        while(!pq.isEmpty())
        {
            int[] current = pq.poll();
            int node = current[1];
            int weight = current[0];
            
            if(visited[node]) continue;
            visited[node]= true;
            
            mst += weight;
            
            for(int[] nbr : adj.get(node))
            {
                int adjnode = nbr[0];
                int adjweight = nbr[1];
                
                if(!visited[adjnode])
                {
                    pq.offer(new int[] {adjweight,adjnode});
                }
                
            }
        }
        return mst;
    }
}
