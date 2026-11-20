public static int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    
    for (int stone : stones) maxHeap.add(stone);
    
    while (maxHeap.size() > 1) {
        int heaviest = maxHeap.poll();
        int secHeaviest = maxHeap.poll();
        
        if (heaviest != secHeaviest) maxHeap.add(heaviest - secHeaviest); //adds the difference
    }
    
    return maxHeap.isEmpty() ? 0 : maxHeap.peek(); //return remaining stone or 0
}
