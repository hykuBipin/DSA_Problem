class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null) return new ArrayList<>();
        int n=nums.length;
        int target=0;

        Arrays.sort(nums);

        for(int i=0;i<n-2;i++)
        {
            //duplicate check
            if(i>0 && nums[i]==nums[i-1]) continue;

            int start=i+1,end=n-1;

            while(start<end)
            {
                int sum = nums[i] + nums[start] +nums[end];
                if(sum==target)
                {
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    end--;

                    //skip duplicates in result
                    while(start < end && nums[start]==nums[start-1]) start++;
                    while(start < end && nums[end]==nums[end+1]) end--;

                }else if(sum < target)
                {
                     start++;
                } else
                {
                     end--;
                }
            }
        }

       return result;
    }
}