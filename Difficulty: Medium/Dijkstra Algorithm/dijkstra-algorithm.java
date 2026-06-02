class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        if(V<=0) return new int[]{};
        
        List<List<int[]>> graph = new ArrayList<>();
        
        //create Adjacency List
        for(int i=0;i<V;i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(int[] edge : edges)
        {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            
            graph.get(u).add(new int[] {v,w});
            
            graph.get(v).add(new int[] {u,w});
        }
        
        
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        dist[src]=0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.offer(new int[] {src,0});
        
        while(!pq.isEmpty())
        {
            int[] current = pq.poll();
            
            int node  =  current[0];
            int currentDist = current[1];
            
            if(currentDist > dist[node]) continue;
            
            for(int[] nbr : graph.get(node))
            {
                int nextNode = nbr[0];
                int weight = nbr[1];
                
                int newWeight = currentDist + weight;
                
                if(newWeight < dist[nextNode])
                {
                    dist[nextNode] = currentDist + weight;
                    pq.offer(new int[] {nextNode, newWeight});
                }
            }
        }
        return dist;
    }
}