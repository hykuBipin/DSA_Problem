class Solution {
    public String longestCommonPrefix(String[] strs) {
        int idx=0;
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        while(idx<str1.length() && idx<str2.length())
        {
            if(str1.charAt(idx)==str2.charAt(idx))
            {
                idx++;
            }else
            {
            break;
            }
        }
        return str1.substring(0,idx);
    }
}