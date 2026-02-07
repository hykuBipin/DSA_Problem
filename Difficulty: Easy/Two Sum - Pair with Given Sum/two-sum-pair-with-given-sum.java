class Solution {
    boolean twoSum(int arr[], int target) {
       int n=arr.length;
       if(arr==null || n==0) return false;
       
       HashSet<Integer> set = new HashSet<>();
       
       for(int i=0;i<n;i++)
       {
           int remaining = target -arr[i];
           if(set.contains(remaining))
           {
               return true;
           }
           set.add(arr[i]);
       }
        return false;
    }
}