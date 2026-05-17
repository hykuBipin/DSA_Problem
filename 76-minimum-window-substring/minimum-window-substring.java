class Solution {
    public String minWindow(String s, String t) {
       if(s==null || t==null || s.length() < t.length()) return "";
       HashMap<Character,Integer> targetmap = new HashMap<>();

       for(int i=0;i<t.length();i++)
       {
           targetmap.put(t.charAt(i),targetmap.getOrDefault(t.charAt(i),0)+1);
       }

       int minlen=Integer.MAX_VALUE,left=0;
       int formed=0,start=0;
       int target = targetmap.size();
       HashMap<Character,Integer> window = new HashMap<>();

       for(int right=0;right<s.length();right++)
       {
           char ch=s.charAt(right);
           window.put(ch, window.getOrDefault(ch,0)+1);

           if(targetmap.containsKey(ch) && window.get(ch).intValue()==targetmap.get(ch).intValue())
           {
             formed++;
           }

           while(formed==target)
           {
               if(right-left+1 < minlen)
               {
                  minlen = right-left+1;
                  start=left;
               }

           char leftchar = s.charAt(left);
           window.put(leftchar,window.get(leftchar)-1);

           if(targetmap.containsKey(leftchar) && window.get(leftchar) < targetmap.get(leftchar))
           {
              formed--;
           }
          left++;
         }
       }
         return minlen == Integer.MAX_VALUE ? "" : s.substring(start,start+minlen);
    }
}

// Time & Space Complexity:
// The solution runs in O(m + n) time, where m = length of s and n = length of t, because each character is visited at most twice (once when expanding the window and once when contracting). Space complexity is O(m + n) due to the hash maps, which is optimal for this problem.