public static List<Integer> kSmallest(int[] inAr, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int num : inAr) {
        minHeap.add(num);
    }
    
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < k && !minHeap.isEmpty(); i++) result.add(minHeap.poll());
    return result;
}
