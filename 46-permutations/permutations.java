class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums==null || nums.length <=0 ) return new ArrayList<>();
        int n=nums.length;

        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[n];

        backtrack(nums,visited,new ArrayList<>(),result);

        return result;
    }

    public void backtrack(int[] nums, boolean[] visited, List<Integer> current, List<List<Integer>> result)
    {
         //Base case
         if(current.size()==nums.length)
         {
            result.add(new ArrayList<>(current));
         }
         
         for(int i=0;i<nums.length;i++)
         {
            if(visited[i]) continue;

            //choose
            current.add(nums[i]);
            visited[i]=true;

            //explore
            backtrack(nums,visited,current,result);

            //unchoose
            current.remove(current.size()-1);
            visited[i]=false;
         }
    }
}

// Time & Space Complexity
// Time: O(n * n!)
// There are n! permutations, and each one takes O(n) to copy into the result.
// Space: O(n) auxiliary space for:
// recursion depth
// visited
// current path
// Excluding the output storage, this is optimal for backtracking.