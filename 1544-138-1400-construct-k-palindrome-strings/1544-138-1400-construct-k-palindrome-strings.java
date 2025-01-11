class Solution {
    public boolean canConstruct(String s, int k) {
        int bitmask=0;
        if(s.length()< k) return false;
        for(char c:s.toCharArray())
        {
            bitmask ^= (1 <<(c-'a'));
        }
        int oddcount =Integer.bitCount(bitmask);
        return oddcount <= k;
    }
}