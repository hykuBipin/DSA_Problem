class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int n=nums.length;

        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        } 

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() <= 1) { 
            return entry.getKey();
         }
        }
        return -1;
    }
}