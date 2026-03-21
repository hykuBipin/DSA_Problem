class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people==null) return -1;
        int n=people.length;

        int start=0,end=n-1;
        int count=0;
        Arrays.sort(people);

        while(start<=end)
        {
           int sum=people[start] + people[end];
           if(sum<=limit)
           {
              start++;
           }
           end--;
           count++;
        }
       return count;
    }
}