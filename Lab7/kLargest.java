public static List<Integer> kLargest(int[] inAr, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    for (int num : inAr) {
        minHeap.add(num);
        if (minHeap.size() > k) minHeap.poll();
    }
    return new ArrayList<>(minHeap);
}
