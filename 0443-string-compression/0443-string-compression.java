class Solution {
    public int compress(char[] chars) {
        int N=chars.length;
        int i=0;
        int j=0;
        while(i < N)
        {
            char currentchar = chars[i];
            int count=0;
            
            while(i < N && currentchar == chars[i])
            {
                i++;
                count++;
            }
            
            chars[j++] = currentchar;
            
            if(count > 1)
            {
                for(char digit: Integer.toString(count).toCharArray())
                {
                    chars[j++] = digit;
                }
            }
        }
        return j;
    }
}