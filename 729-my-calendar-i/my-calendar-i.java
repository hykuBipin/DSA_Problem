class MyCalendar {
    TreeMap<Integer,Integer> calendar;
    public MyCalendar() {
        calendar = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start);

        if(prev!=null && calendar.get(prev) >  start) return false;

        Integer next = calendar.ceilingKey(start);
        
        if(next!=null && next < end) return false;

        calendar.put(start,end);

        return true;
    }
}

// Time & Space Complexity
// Time: O(log n) per book() call, due to TreeMap lookups and insertion.
// Space: O(n) for storing all booked events.
// This is optimal for the problem constraints and a very clean use of an ordered map.

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */