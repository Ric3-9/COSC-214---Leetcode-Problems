import java.util.HashMap;

public class StudentMapping {
    public static void main(String[] args) {
        // Student ID, Student name
        HashMap<Integer, String> students = new HashMap<>();

        // adds students to the map
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Marlie");
        System.out.println("Initial Map: " + students);

        // Retrieve student name 
        String student101 = students.get(101);
        System.out.println("Retrieved student 101: " + student101);

        // Update an existing value (Bob to Robert)
        students.put(102, "Robert");
        System.out.println("After updating 102: " + students.get(102));

        // Remove a student ID
        students.remove(103);
        System.out.println("Final Map after removing 103: " + students);
    }
}
