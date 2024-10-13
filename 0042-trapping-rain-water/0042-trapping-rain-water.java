class Solution {
    public int trap(int[] height) {
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        if (height.length ==1)
        return 0;


        leftmax[0]=height[0]; 
        for(int i=1;i < height.length; i++){
           leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        rightmax[height.length-1]=height[height.length-1];
        for(int j=height.length-2; j >= 0 ; j--){
            rightmax[j] = Math.max(height[j], rightmax[j+1]);
        }

        int waterlevel=0;
        for(int k=0;k< height.length;k++)
        {
        waterlevel += (Math.min(leftmax[k],rightmax[k])) - height[k];
        }
        return waterlevel;
    }
}