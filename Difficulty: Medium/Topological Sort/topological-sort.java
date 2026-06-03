class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        if(V <=0 ) return new ArrayList<>();
        
        int[] indegree = new int[V];
        
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            graph.add(new ArrayList<>());
        }
        
        //Build Adjacency List
        for(int[] edge : edges)
        {
            int u = edge[0];
            int v = edge[1];
            
            graph.get(u).add(v);
        }
        
        //calculate indegree
        for(int i=0;i<V;i++)
        {
            for(int nbr : graph.get(i))
            {
                indegree[nbr]++;
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        //calculate indegree with lowest and push it queue
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                queue.offer(i);
            }
        }
        
        
        //handles neighbour nodes
        while(!queue.isEmpty())
        {
            int node = queue.poll();
            result.add(node);
            
            for(int nbr: graph.get(node))
            {
                indegree[nbr]--;
                
                if(indegree[nbr]==0)
                {
                    queue.offer(nbr);
                }
            }
        }
        return result;
    }
}