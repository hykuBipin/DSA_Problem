class Solution {
    public boolean isCycle(int V, int[][] edges) {
      if(V<=0) return false;
      ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
      boolean[] visited =new boolean[V];
      
      for(int i=0;i<V;i++)
      {
          adj.add(new ArrayList<>());
      }
      
      for(int[] e:edges)
      {
          adj.get(e[0]).add(e[1]);
          adj.get(e[1]).add(e[0]);
      }
      
      for(int i=0;i<V;i++)
      {
          if(!visited[i])
          {
             if(dfs(i,-1,visited,adj))
                 return true;
          }
      }
       return false;
         
    }
    
    public static boolean dfs(int node, int parent,boolean[] visited, ArrayList<ArrayList<Integer>> adj)
    {
        visited[node]=true;
        
        for(int child:adj.get(node))
        {
            if(!visited[child])
            {
                if(dfs(child,node,visited,adj))
                {
                    return true;
                }
            }else if(child!= parent)
                {
                    return true;
                }
        }
        return false;
    }
}