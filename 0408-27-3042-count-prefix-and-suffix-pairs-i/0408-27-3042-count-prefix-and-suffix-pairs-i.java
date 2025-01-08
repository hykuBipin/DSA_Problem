class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int N=words.length;
        int count=0;
        for(int i=0; i <N;++i)
        {
            for(int j=i+1;j<N;++j)
            {
                if(isprefixAndSuffix(words[i],words[j]))
                {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isprefixAndSuffix(String str1, String str2)
    {   int n1=str1.length(), n2=str2.length();  
        if(n1>n2) return false;
        return str2.substring(0,n1).equals(str1) && str2.substring(n2-n1).equals(str1);
    }
}