class Solution {
        List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n=nums.length;
        List<Integer> result = new ArrayList<>();
        boolean[] used=new boolean[n];
        //sort array to avoid duplicates
        Arrays.sort(nums);
        solve(nums,result,used,n);
        return answer;
    }

    void solve(int[] arr, List<Integer> result, boolean[] used, int n)
    {
        if(n<0) {return;}

        if(result.size()==n)
        {
            answer.add(new ArrayList<>(result));
            return;
        }

        for(int i=0; i < n; i++)
        {
            if(used[i]) continue;
           
           //skip duplicates
           if(i>0 && arr[i]==arr[i-1] && !used[i-1]) continue;

            result.add(arr[i]);
            used[i]=true;

            solve(arr,result,used,n);

            result.remove(result.size()-1);
            used[i]=false;
        }
    }
}