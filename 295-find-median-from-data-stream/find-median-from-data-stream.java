class MedianFinder {
    PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> min = new PriorityQueue<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        min.offer(num);
        max.offer(min.poll());
        if(min.size() < max.size())
        {
            min.offer(max.poll());
        }
    }
    
    public double findMedian() {
        if(min.size()==max.size())
        {
            return (min.peek() + max.peek()) / 2.0;
        }else
        {
            return min.peek();
        }
    }
}

// Time Complexity:
// Constructor : O(1)
// addNum()    : O(log N)
//   - Heap insertion/removal operations each take O(log N).
// findMedian(): O(1)
//   - Median is obtained directly from the heap tops.

// Space Complexity:
// O(N)
// Both heaps together store all N inserted elements exactly once.

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */