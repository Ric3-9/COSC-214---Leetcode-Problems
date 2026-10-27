import java.util.HashMap;

public class RomanConvert {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> Romanvalues = new HashMap<>();
        Romanvalues.put('I', 1);
        Romanvalues.put('V', 5);
        Romanvalues.put('X', 10);
        Romanvalues.put('L', 50);
        Romanvalues.put('C', 100);
        Romanvalues.put('D', 500);
        Romanvalues.put('M', 1000);
        
        int integerVal = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int currentVal = Romanvalues.get(s.charAt(i));
            
            // Check if there is a next char and if its value is larger
            if (i < s.length() - 1 && currentVal < Romanvalues.get(s.charAt(i + 1))) {

                integerVal -= currentVal; // Subtract if smaller than the next symbol

            } else { integerVal += currentVal; // Otherwise, add it to the total
        }
        
        return total;
    }
}
