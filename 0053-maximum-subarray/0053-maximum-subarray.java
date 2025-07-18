class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(nums==null || n==0)
        {
        throw new IllegalArgumentException("Array should not be null");
        }

        int currsum=nums[0],maxsum=nums[0];
        int start=0,end=0,tempstart=0;
        for(int i=1;i<n;i++)
        {
            if(currsum < 0)
            {
                currsum=nums[i];
                tempstart=i;
            }else 
            {
                currsum+=nums[i];
            }

            if(currsum > maxsum)
            {
                maxsum=currsum;
                start=tempstart;
                end=i;
            }
        }

        for(int i=start;i<=end;i++)
        {
            System.out.print(nums[i] + " ");
        }

        return maxsum;
    }
}