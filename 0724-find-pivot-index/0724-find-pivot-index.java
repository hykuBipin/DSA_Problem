class Solution {
    public int pivotIndex(int[] nums) {
        int N=nums.length;
        int rightsum=0; int leftsum=0;
        
        for(int i=0; i< N; i++)
        {
            rightsum += nums[i]; 
        }
        
        for(int j=0; j <N; j++)
        {
            rightsum -= nums[j];
            if(rightsum == leftsum)
            {
                return j;
            }
            leftsum += nums[j];
        }
        return -1;
    }
}