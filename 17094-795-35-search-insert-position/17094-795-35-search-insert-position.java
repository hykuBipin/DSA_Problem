class Solution {
    public int searchInsert(int[] nums, int target) {
        int N=nums.length;
        int start=0;int end=N-1;

        if(N==0) return -1;      
        while(start <= end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                return mid;
            }else if(nums[mid] < target)
            {
                start=mid+1;
            }else
            {
                end=mid-1;
            }
        }
        return end+1; 
    }
}