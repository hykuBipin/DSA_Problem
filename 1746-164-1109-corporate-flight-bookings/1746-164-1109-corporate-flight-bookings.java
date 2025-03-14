class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff =new int[n+1];

        for(int[] booking: bookings)
        {
            int left=booking[0];
            int right=booking[1];
            int value=booking[2];

                    diff[left-1] += value;
                if(right < diff.length)
                {
                    diff[right] -= value;
                }
        }
        int[] result= new int[n];
        int current=0;
        for(int i=0;i<n;i++)
        {
            current += diff[i];
            result[i]=current;
        }
        return result;
    }
}