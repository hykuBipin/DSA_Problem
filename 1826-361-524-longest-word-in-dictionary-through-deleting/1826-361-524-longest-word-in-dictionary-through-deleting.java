class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans="";
        for(String word:dictionary)
        {
            int a=word.length(),b=ans.length();
            if(a <  b|| (a==b) && word.compareTo(ans)>0) continue;
            int pos=-1;
            for(int i=0; i<a;i++)
            {
                pos=s.indexOf(word.charAt(i),pos+1);
                if(pos==-1)break;
            }
            if(pos!=-1)ans=word;
        }
        return ans;
    }
}