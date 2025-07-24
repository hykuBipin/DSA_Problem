class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows <= 0) return new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            result.add(ncr(i));
        }

        return result;
    }

    public static List<Integer> ncr(int n)
    {
        long ans=1;
        List<Integer> templist= new ArrayList<>();
        templist.add(1);

        for(int j=1;j<=n;j++)
        {
            ans = ans*(n-j+1);
            ans = ans/j;
            templist.add((int)ans);
        }
          return templist;
    }
}