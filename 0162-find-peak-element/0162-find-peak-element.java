class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n <= 0 )
       {
        throw new IllegalArgumentException("Array is null");
       }
        int low=0, high=n-1;
        while(low < high)
        {
            int mid = (low + high)/2;
           if(nums[mid] < nums[mid + 1])
            {
                   low = mid + 1;
            }else
            {
                   high = mid;
            }
        }
        return low;
    }
}