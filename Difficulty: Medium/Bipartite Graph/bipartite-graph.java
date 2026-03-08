class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        if(V<=0) return false;
      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
      
      int[] colours= new int[V];
      Arrays.fill(colours,-1);
      
      for(int i=0;i<V;i++)
      {
          adj.add(new ArrayList<>());
      }
      
      for(int[] e: edges)
      {
          adj.get(e[0]).add(e[1]);
          adj.get(e[1]).add(e[0]);
      }
      
      for(int i=0;i<V;i++)
      {
          if(colours[i] == -1)
          {
              if(! dfs(i,0,colours,adj))
              {
                  return false;
              }
          }
      }
       return true; 
    }
    
    public static boolean dfs(int node, int parent, int[] coloured, ArrayList<ArrayList<Integer>> adj)
    {
        coloured[node]=parent;
        
        for(int child: adj.get(node))
        {
            if(coloured[child]==-1)
            {
                if(!dfs(child,1-parent,coloured,adj))
                {
                    return false;    
                }
            }else if(coloured[child]==parent)
            {
                return false;
            }
        }
        return true;
    }
}