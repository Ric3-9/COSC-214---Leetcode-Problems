import java.util.HashMap;

public class FreqCount {
    public static HashMap<Integer, Integer> frequencyCount(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) { // goes through array and counts how many times
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        return freq;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 1, 1, 4};
        System.out.println("Frequency Map: " + frequencyCount(input));
    }
}
