class Solution {
    List<List<Integer>> answer= new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> result = new ArrayList<>();

        solve(n,k,1,result);
        return answer;
    }

    void solve(int n, int k, int start, List<Integer> result)
    {
        if(n<0) return;

        if(result.size()==k) 
        {
            answer.add(new ArrayList<>(result));
            return;
        }

        for(int i=start;i<=n;i++)
        {

            // //avoid duplicates
            // if(i>0 && i==i-1) continue;

            result.add(i);

            solve(n,k,i+1,result);

            result.remove(result.size()-1);
        }
    }
}