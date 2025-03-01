class Solution {
    public int findPeakElement(int[] nums) {
        int N=nums.length;
        int start=0,end=N-1;
        if(N==0) return 1;
        if(N==1) return 0;
        
        while(start <= end)
        { 
            int mid=(start+end)/2;
            int prev=(mid==0) ? Integer.MIN_VALUE : nums[mid-1];
            int next=(mid==N-1) ? Integer.MIN_VALUE : nums[mid+1]; 
            if(nums[mid] >= prev && nums[mid] >= next)
            {
                return mid;
            }else if(nums[mid] > prev)
            {
                 start=mid+1;
            }else
            {
                 end=mid-1;  
            }
        }
            return 1;
    }
}