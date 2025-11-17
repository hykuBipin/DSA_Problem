class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int previndex=-1;
        if(k<=0 || n <=0)
        {
            return true;
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                if(previndex != -1 && i - previndex <= k)
                {
                    return false;
                }
                previndex=i;
            }
        }
       return true;
    }
}