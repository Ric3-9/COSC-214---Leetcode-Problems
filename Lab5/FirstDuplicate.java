import java.util.HashSet;

public class FirstDuplicate {
    public static Integer firstDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
          //checks if nums already contains num
            if (seen.contains(num)) return num;
            seen.add(num);
        }
        
        return null; // if no duplicates exist
    }

    public static void main(String[] args) {
        int[] input = {3, 1, 4, 2, 5, 3};
        System.out.println("First Duplicate: " + firstDuplicate(input));
    }
}
