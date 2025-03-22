class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int N=nums.length;
        List<Integer> subset = new ArrayList<>();
        solve(nums,subset,0);
        return list;
    }

    void solve(int[] arr, List<Integer> subset, int idx)
    {
        if(idx==arr.length)
        {
            list.add(new ArrayList<>(subset));
            return;
        }

   //not take
        solve(arr,subset,idx+1);
   //take
        subset.add(arr[idx]); 
        solve(arr,subset,idx+1);
        subset.remove(subset.size()-1);  
    }
}