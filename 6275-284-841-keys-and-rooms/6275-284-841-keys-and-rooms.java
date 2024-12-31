class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int m=rooms.size();
        boolean[] visited=new boolean[m];
        dfs(rooms.get(0),0,rooms,visited);
          
        for(int i=0;i<visited.length;i++)  
        {
        if(!visited[i])
         {
            return false;
         }
        }

        return true;
    }

    private void dfs(List<Integer> RoomsInKey,int room,List<List<Integer>> rooms,boolean[] visited)
    {
        visited[room]=true;
        for(Integer i:RoomsInKey)
        {
            if(!visited[i])
            {
                dfs(rooms.get(i),i,rooms,visited);
            }
        }
    }
}