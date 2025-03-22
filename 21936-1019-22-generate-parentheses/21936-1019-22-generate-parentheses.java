class Solution {
    ArrayList<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        solve("",0,0,n);
        return list;
    }

    void solve(String curr, int c_open, int c_close, int n)
    {
        if(c_open == n && c_close== n)
        {
            list.add(curr);
            return;
        }

        if(c_open < n)
        {
            solve(curr + "(", c_open+1, c_close, n);
        }

        if(c_open > c_close)
        {
            solve(curr + ")", c_open, c_close+1, n);
        }
    }
}