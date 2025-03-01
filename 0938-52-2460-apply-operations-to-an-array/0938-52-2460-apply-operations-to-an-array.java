class Solution {
    public int[] applyOperations(int[] nums) {
        int N=nums.length;
        int[] ans=new int[N];
        ans[0]=nums[0];
        for(int i=0;i<N-1;i++)
        {
            if(i < N - 1 && nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }

        int index=0;
        for(int num:nums)
        {
            if(num!=0)
            {
                ans[index++]=num;
            }
        }

        while(index < N)
        {
            ans[index++]=0;
        }
        return ans;
    }
}