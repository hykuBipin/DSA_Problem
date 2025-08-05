class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        int m=intervals[0].length;

        if(intervals==null || n==0)
        {
            throw new IllegalArgumentException("Array is Null/Empty");
        }

        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int L=intervals[0][0];
        int R=intervals[0][1];

        for(int i=1;i<n;i++)
        {
            int L2=intervals[i][0];
            int R2=intervals[i][1];
            if(L2 <= R)
            {
                R = Math.max(R,R2);
            }else
            {
                list.add(new int[]{L,R});
                L=L2;
                R=R2;
            }
        }
      list.add(new int[]{L,R});
      return list.toArray(new int[list.size()][]);
    }
}