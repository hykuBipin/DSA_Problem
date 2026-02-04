class Solution {
    public String reorganizeString(String s) {
        int n=s.length();
        if(s==null || n==0) return "";

        int[] freq =new int[26];
        int maxfreq=0;
        char maxchar=' ';

        for(char ch: s.toCharArray())
        {
            freq[ch-'a']++;
            if(freq[ch-'a'] > maxfreq)
            {
                maxfreq=freq[ch-'a'];
                maxchar=ch;
            }
        }

        if(maxfreq > (n+1)/2) return "";

       // placing all charcters in even position
        char[] result=new char[n];
        int index=0;
        while(freq[maxchar-'a'] > 0)
        {
            result[index]=maxchar;
            index +=2;
            freq[maxchar-'a']--;
        }

        //odd positions for other charcters
         for(int i=0;i<26;i++)
         {
            while(freq[i] >0)
            {
            if(index >= n)
            {
                index=1;
            }

            result[index]= (char) (i + 'a');
            index +=2;
            freq[i]--;
            }
         }
       return new String(result);
    }
}