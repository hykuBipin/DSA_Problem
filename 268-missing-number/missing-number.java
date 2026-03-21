class Solution {
    public int missingNumber(int[] nums) {
        if(nums==null) return -1;
        int n=nums.length;
        int result=0;
        int temp=0;

        for(int num:nums)
        {
            result = result ^ num;
        }

        for(int i=1;i<=n;i++)
        {
           temp = temp ^ i;
        }

        return result ^ temp;
    }
}