class Solution {
    public int minReorder(int n, int[][] connections) {
       List<List<Integer>> list=new ArrayList<>();
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(var c:connections)
        {
            list.get(c[0]).add(c[1]);
            list.get(c[1]).add(-c[0]);
        }
        return dfs(list,visited,0);
    }

    private int dfs(List<List<Integer>> list, boolean[] visited,int source) 
    {
        int change=0;
        visited[source]=true;
        for(var destination: list.get(source))
        {
           if(!visited[Math.abs(destination)])
           {
            change += dfs(list,visited,Math.abs(destination)) +(destination >0 ?1:0);
           }
        }
        return  change;
    }
}