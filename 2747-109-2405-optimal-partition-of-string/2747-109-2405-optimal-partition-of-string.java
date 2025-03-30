class Solution {
    public int partitionString(String s) {
        HashSet<Character> map = new HashSet<>();
        int count=1;int max=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.contains(ch))
            {
                count++;
                map.clear();
            }
            map.add(ch); 
        }
        return count;
    }
}