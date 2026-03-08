class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer> result = new ArrayList<>();
       boolean[] visited = new boolean[adj.size()];
       
       for(int i=0;i<adj.size();i++)
       {
           if(!visited[i])
           {
                 bfssolve(adj,visited,0,result);
           }
       }
       return result;
    }
    
    public static void bfssolve(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int index, ArrayList<Integer> result)
    {
        Queue<Integer> queue = new LinkedList<>();
        visited[index]=true;
        queue.add(index);
        
        while(!queue.isEmpty())
        {
            int current = queue.poll();
            result.add(current);
            
            for(int i: adj.get(current))
            {
                if(!visited[i])
                {
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }
    }
}