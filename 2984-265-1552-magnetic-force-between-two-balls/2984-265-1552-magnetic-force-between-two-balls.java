class Solution {
    public int maxDistance(int[] position, int m) {
        int N=position.length;
        if(m>N) return 0;
        Arrays.sort(position);
        int start=0;
        int end=position[N-1]-position[0];
        int ans=-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(possible(position,m,mid))
            {
                ans=mid;
                start=mid+1;
            }else
            {
                end=mid-1;
            }

        }
        return ans;
    }

    boolean possible(int[] stalls, int numofballs,int distance)
    {
        int N=stalls.length;
        int ballsplaced=1;
        int prev=stalls[0];

        for(int i=1;i<N;i++)
        {
            if(stalls[i]-prev >= distance)
            {
                ballsplaced++;
                prev=stalls[i];
            }
        }
        return ballsplaced >= numofballs;
    }
}