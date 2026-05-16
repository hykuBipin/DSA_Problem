class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2==null || s1==null || s2.length() < s1.length()) return false;
        int n=s2.length();

        int[] s1freq = new int[26];
        int[] windowfreq = new int[26];

        for(int i=0;i<s1.length();i++)
        {
            s1freq[s1.charAt(i)-'a']++;
        }

        int left=0;
        for(int right=0;right < s2.length();right++)
        {
            windowfreq[s2.charAt(right)-'a']++;

            if(right-left+1 > s1.length())
            {
                windowfreq[s2.charAt(left)-'a']--;
                left++;
            }

            if(Arrays.equals(s1freq,windowfreq))
            {
                return true;
            }
        }
        return false;
    }
}

// Time & Space Complexity:

// Time complexity: O(n * 26) due to Arrays.equals call inside the loop, where n is the length of s2. Since the alphabet size is fixed at 26, this is effectively O(n).
// Space complexity: O(1) because frequency arrays are fixed size (26).
// This is optimal given the constraints.