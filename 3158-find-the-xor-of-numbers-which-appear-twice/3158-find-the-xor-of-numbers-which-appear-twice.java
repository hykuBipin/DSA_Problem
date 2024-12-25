class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int N=nums.length;
        int result=0;
        
        for(int num: nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int num: map.keySet())
        {
            if(map.get(num)==2)
            result = result^num;
        }
        return result;
    }
}