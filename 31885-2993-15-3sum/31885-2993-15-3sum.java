class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int m=nums.length;
        int target=0;

        Arrays.sort(nums);

        int sum=0;
        Set<List<Integer>> set =new HashSet<>();
        List<List<Integer>> result= new ArrayList<>();
        
        for(int i=0;i<m;i++)
        {
            int j=i+1,k=m-1;
            while(j<k)
            {
                sum = nums[i]+nums[j]+nums[k];
                if(sum==target)
                {
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if( sum < target)
                {
                    j++;
                }else
                {
                    k--;
                }
            }
        }
        result.addAll(set);
        return result;
    }
}