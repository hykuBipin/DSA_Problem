class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length() != word2.length())
        {
            return false;
        }
        
        HashMap<Character,Integer> map1 =new HashMap<>();
        HashMap<Character,Integer> map2 =new HashMap<>();
        for(char num:word1.toCharArray())
        {
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        
        for(char num:word2.toCharArray())
        {
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }
        
        int[] freq1 = new int[map1.size()];
        int[] freq2 = new int[map2.size()];
        
        int index = 0;
        for (int count : map1.values()) {
            freq1[index++] = count;
        }
        
        index = 0;
        for (int count : map2.values()) {
            freq2[index++] = count;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
        
    }
}