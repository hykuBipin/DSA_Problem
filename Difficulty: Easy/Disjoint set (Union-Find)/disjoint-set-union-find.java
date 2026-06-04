class Solution {
        int[] parent;
        
        int find(int x)
        {
            if(parent[x]!=x)
            {
                parent[x] = find(parent[x]);  //path compression
            }
            return parent[x];
        }
        
        void union(int x, int y)
        {
            int px=find(x);
            int py=find(y);
            
            if(px!=py)
            {
                parent[px] = py;
            }
        }
        
    public ArrayList<Integer> DSU(int n, int[][] queries) {

        if(n<=0) return new ArrayList<>();
        
        ArrayList<Integer> result = new ArrayList<>();

        parent = new int[n+1];
           
           for(int i=1;i<=n;i++)
           {
               parent[i]=i;
           }
           
           for(int[] q : queries)
           {
               int type = q[0];
           
           if(type==1)
           {
               int x = q[1];
               int y = q[2];
               union(x,y);
           }else
           {
               int x=q[1];
               result.add(find(x));
           }
         }
         
        return result;
    }
}
