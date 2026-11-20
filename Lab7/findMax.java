public static int findMax(int[] inAr) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    
    for (int num : inAr) {
        maxHeap.add(num);
    }
    
    return maxHeap.peek();
}
