class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] result = new int[2];
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);

        if (result[0] == -1 || result[1] == -1 || result[0] >= n || result[1] >= n || nums[result[0]] != target || nums[result[1]] != target || result[0] > result[1]) {
            
            return new int[]{-1, -1};
        }
        return result;
    }

    public int findFirst(int[] nums, int target)
    {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
         while(low <= high)
        {
            int mid=low + (high -low)/2;
            if(nums[mid] >= target)
            {
                 ans=mid;
                 high=mid-1;
            }else
            {
                 low=mid+1;
            }
        }
        return ans;
    }

    public int findLast(int[] nums, int target)
    {
        int n=nums.length;
        int low = 0;
        int high = n - 1;
        int ans=-1;
        while(low <= high)
        {
            int mid=low + (high -low)/2;
            if(nums[mid] <= target)
            {
                 ans=mid;
                 low=mid+1;
            }else
            {
                 high=mid-1;
            }
        }
        return ans;
    }
}