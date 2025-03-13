class Solution {
    public int titleToNumber(String columnTitle) {
        int N=columnTitle.length();
        int res=0;
        for(int i=0;i<N;i++)
        {
            int charval = columnTitle.charAt(i)-'A' + 1;
            res = res * 26 +charval;
        }
        return res;
    }
}