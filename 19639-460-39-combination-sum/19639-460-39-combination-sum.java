class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> subset=new ArrayList<>();
        solve(candidates,subset,0,target);
        return list;
    }

    void solve(int[] arr, List<Integer>  subset,  int idx, int target)
    {
        if(target==0)
        {
            list.add(new ArrayList<>(subset));
            return;
        }

        if(target <0)
        {
            return;
        }

        for(int i=idx;i<arr.length;i++)
        { 
            subset.add(arr[i]);
            solve(arr,subset,i,target-arr[i]);
            subset.remove(subset.size()-1);
        }
    }
}