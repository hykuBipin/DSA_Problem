class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int N=nums.length;
        List<Integer> subset = new ArrayList<>();
        solve(nums,subset,0);
        return list;
    }

    void solve(int[] arr, List<Integer> subset, int idx)
    {
            list.add(new ArrayList<>(subset));

   //take
     for(int i=idx;i< arr.length;i++)
     { 
        if(i >idx && arr[i]==arr[i-1])
        {
            continue;
        }
        subset.add(arr[i]); 
        solve(arr,subset,i+1);
        subset.remove(subset.size()-1);  
     }

    }
}