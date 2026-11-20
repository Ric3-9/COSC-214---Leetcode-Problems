//(optional challenge)
import java.util.*;

class KthSmallest {
    PriorityQueue<Integer> maxHeap;
    int k;

    public KthSmallest(int k, int[] nums) {
        this.k = k;
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : nums) add(num);
    }

    public int add(int val) {
        maxHeap.add(val);
        if (maxHeap.size() > k) maxHeap.poll();
        return maxHeap.peek();
    }
}
