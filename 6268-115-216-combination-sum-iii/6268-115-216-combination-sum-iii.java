class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> subset = new ArrayList<>();
        solve(k,subset,1,n);
        return list;

    }

    void solve(int k,List<Integer> subset,int idx,int n)
    {
        if(subset.size()==k && n==0)
        {
            list.add(new ArrayList<>(subset));
            return;
        }

        for(int i=idx;i<=9;i++)
        {
            subset.add(i);
            solve(k,subset,i+1,n-i);
            subset.remove(subset.size()-1);
        }
    }
}