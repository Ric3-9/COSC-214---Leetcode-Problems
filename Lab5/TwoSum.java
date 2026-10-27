import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            
            if (sumMap.containsKey(key)) { // ckecks if key already exists
                return new int[]{sumMap.get(key), i}; // if key exists increase the value of key
            }
            // else, add the key it sumMap
            sumMap.put(nums[i], i);
        }
        // if no solution is found returns an empty array
        return new int[]{};
    }
}
