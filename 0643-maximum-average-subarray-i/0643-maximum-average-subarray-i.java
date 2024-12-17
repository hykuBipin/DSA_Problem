class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int N=nums.length;
        int windowsum=0;
        double average=0;
        
       if (k > N) {
            return 0;
        }
        
        for(int i=0; i < k; i++)
        {
            windowsum +=nums[i];
        }
        double result = (double) windowsum / k;
        
        for(int i=k; i < N; i++)
        {
           windowsum += nums[i];
           windowsum -= nums[i-k];
           average = (double)windowsum/k;
           result = Math.max(result, average);
        }
        return result;
    }
}