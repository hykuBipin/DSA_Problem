class Solution {
    public int trap(int[] height) {
        if(height==null) return -1;
        int n=height.length;

        int[] leftmax = new int[n];
        int[] rightmax = new int[n];

        int result=0;

            //left side calculation
            leftmax[0]=height[0];
            for(int i=1;i<n;i++)
            {
                leftmax[i] = Math.max(height[i],leftmax[i-1]);
            }

            //right side calculation
            rightmax[n-1]=height[n-1];
            for(int j=n-2; j>=0;j--)
            {
                rightmax[j] = Math.max(height[j],rightmax[j+1]);
            }

            //final result
            for(int k=0;k<n;k++)
            {
                result += Math.min(leftmax[k],rightmax[k])-height[k];
            }
     

      return result;
    }
}
