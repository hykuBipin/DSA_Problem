class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if(n==0 || flights==null || flights.length==0) return -1;

        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;

        for(int i=0;i<=k;i++)
        {
            int[] temp = Arrays.copyOf(dist,n);
            for(int[] nums: flights)
            {
                int u = nums[0];
                int v = nums[1];
                int weight = nums[2];

                if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < temp[v] )
                {
                    temp[v] = dist[u] + weight;
                }
                   
            }
            dist = temp;
        }
      return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}