// Concrete Collection: Student List

public class StudentList implements Collection {
    private String[] students;

    public StudentList(String[] students) {
        this.students = students;
    }

    @Override
    public Iterator createIterator() {
        return new StudentIterator(students);
    }
}
