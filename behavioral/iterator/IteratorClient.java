// Iterator Pattern Client

public class IteratorClient {
    public static void main(String[] args) {
        System.out.println("=== Iterator Pattern ===");

        String[] students = {"John", "Jane", "Bob", "Alice", "Charlie"};
        StudentList studentList = new StudentList(students);
        Iterator iterator = studentList.createIterator();

        System.out.println("\n--- Iterating through Students ---");
        while (iterator.hasNext()) {
            System.out.println("Student: " + iterator.next());
        }

        System.out.println("\n--- Using Enhanced For Loop ---");
        for (String student : students) {
            System.out.println("Student: " + student);
        }
    }
}
