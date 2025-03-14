class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int N=nums.length;
        int sum=0,querycount=0;
        int[] diff = new int[N+1];

        for(int i=0;i<N;i++)
        {
            while(sum +diff[i] < nums[i])
            {
                querycount++;
                if(querycount > queries.length ) return -1;
                int left = queries[querycount-1][0];
                int right= queries[querycount-1][1];
                int value= queries[querycount-1][2];

                if(right >= i)
                {       diff[Math.max(left,i)] +=value;
                    if(right+1 < diff.length)
                    {
                        diff[right+1] -=value;
                    }
                }
            }
            sum += diff[i];
        }
        return querycount;
    }
}