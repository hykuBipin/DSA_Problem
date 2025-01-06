class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        int N=intervals.length;
        if(N==0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 
        int L=intervals[0][0];
        int R=intervals[0][1];

        for(int i=1; i<N;i++)
        {
            int L2= intervals[i][0];
            int R2= intervals[i][1];
          if (L2 <= R) {
                R = Math.max(R, R2);
            } else {
                ans.add(new int[]{L, R});
                L = L2;
                R = R2;
            }
        }

        ans.add(new int[]{L, R});
        return ans.toArray(new int[ans.size()][]);
    }
}