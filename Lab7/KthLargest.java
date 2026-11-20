class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;

    public KthLargest(int k, int[] inNums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        
        for (int num : inNums) add(num);
    }

    public int add(int val) {
        minHeap.add(val);
        
        if (minHeap.size() > k) minHeap.poll();
        
        return minHeap.peek();
    }
}
