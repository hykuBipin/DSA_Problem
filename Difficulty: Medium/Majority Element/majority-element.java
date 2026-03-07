class Solution {
    int majorityElement(int arr[]) {
       int n=arr.length;
       
       if(arr==null || n<=0 ) return -1;
       
       HashMap<Integer,Integer> map = new HashMap<>();
       
       for(int num: arr)
       {
           
           map.put(num,map.getOrDefault(num,0)+1);
           if(map.get(num) > n/2)
              return num;
       }

        return -1;
    }
}