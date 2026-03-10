// User function Template for Java

class Solution {
    static int minThrow(int N, int arr[]) {
             int n=30;;
             
             boolean[] visited = new boolean[n+1];
             
             int[] board = new int[n+1];
             Arrays.fill(board,-1);
             
             for(int i=0;i<2*N;i+=2)
             {
                 board[arr[i]]= arr[i+1];
             }
             
             Queue<int[]> queue = new LinkedList<>();
             
             visited[1]=true;
             queue.add(new int[]{1,0});
             
             while(!queue.isEmpty())
             {
                 int[] current = queue.poll();
                 int v = current[0];
                 int dist = current[1];
                 
                 if(v==n) return dist;
                 
                 for(int i=v+1; i<= v+6 && i<=n;++i)
                 {
                     if(!visited[i])
                     {
                         visited[i]=true;
                         int dest = (board[i] != -1) ? board[i] : i;
                         queue.add(new int[] {dest,dist+1});
                     }

                 }
                 
             }
        return -1;
    }

}