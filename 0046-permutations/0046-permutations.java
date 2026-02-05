class Solution {
      List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        int n=nums.length;
        solve(nums,result,used,n);
        return answer;
    }

    void solve(int[] arr, List<Integer> result ,boolean[] used , int n)
    {
        if(result.size()==n)
        {
            answer.add(new ArrayList<>(result));
            return;
        }

        if(n < 0)
        {
            return;
        }

        for(int i=0; i < n; i++)
        {
            if(used[i]) continue;

            result.add(arr[i]);
            used[i]=true;

            solve(arr,result,used,n);

            result.remove(result.size()-1);
            used[i]=false;
        }
    }
}