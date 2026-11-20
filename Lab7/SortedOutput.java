public static void printSorted(int[] inAr) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    for (int num : inAr) {
        minHeap.add(num);
    }
    
    while (!minHeap.isEmpty()) {
        System.out.print(minHeap.poll() + " ");
    }
}
