class Solution {
    public int maxArea(int[] heights) {
        if(heights==null) return -1;
        int n=heights.length;
        int start=0,end=n-1;
        int result=0;
        int maxresult=0;

        while(start<end)
        {
            int height = Math.min(heights[start],heights[end]);
            int width = end-start;

            result = height * width;
            maxresult = Math.max(maxresult,result);
            
            // move smaller height pointer
            if(heights[start] < heights[end])
            {
                start++;
            }else
            {
                end--;
            }
        }
        return maxresult;
    }
}
