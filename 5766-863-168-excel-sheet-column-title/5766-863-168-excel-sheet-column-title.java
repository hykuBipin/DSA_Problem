class Solution {
    public String convertToTitle(int columnNumber) {
        // int N=columnNumber.length();
        StringBuilder res =new StringBuilder();
        while(columnNumber>0)
        {
            columnNumber--;
            char temp= (char) ('A'+ (columnNumber%26));
            res.append(temp);
            columnNumber/=26;
        }
        return res.reverse().toString();
    }
}