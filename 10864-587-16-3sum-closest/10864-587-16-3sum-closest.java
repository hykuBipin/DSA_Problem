class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int N=nums.length;
        Arrays.sort(nums);
        int closestsum=nums[0]+ nums[1]+nums[2];
        
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;

            while(j<k)
            {
                int sum=nums[i] +nums[j] + nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closestsum))
                {
                    closestsum=sum;
                }

                if(sum< target)
                {
                    j++;
                }else
                {
                    k--;
                }
            }
        }
        return closestsum;
    }
}