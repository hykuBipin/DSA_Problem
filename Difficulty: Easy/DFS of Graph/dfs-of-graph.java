class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
      boolean[] visited = new boolean[adj.size()];
      ArrayList<Integer> res = new ArrayList<>();
      
      for(int i=0;i<adj.size();i++)
      {
          if(!visited[i])
          {
              dfssolve(adj,visited,0,res);
          }
      }
      return res;
        
    }
    
    public static boolean dfssolve(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int index, ArrayList<Integer> res)
    {
        visited[index]=true;
        res.add(index);
        
        for(int i: adj.get(index))
        {
            if(!visited[i])
            {
                dfssolve(adj,visited,i,res);
            }   
        }
        return false;
    }
}