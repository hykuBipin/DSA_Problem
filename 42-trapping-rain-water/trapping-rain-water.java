class Solution {
    public int trap(int[] height) {
        if(height==null) return -1;
        int n=height.length;

        int result=0;

        int start=0,end=n-1;
        int leftmax=0,rightmax=0;
        
        while(start<=end)
        {
            if(height[start] < height[end])
            {
                if(height[start] >= leftmax)
                {
                    leftmax=height[start];
                }else
                {
                    result += leftmax - height[start];
                }
                start++;
            }else
            {
                if(height[end] >= rightmax)
                {
                    rightmax = height[end];
                }else
                {
                    result += rightmax - height[end];
                }
                end--;
            }
        }
    
      return result;
    }
}
