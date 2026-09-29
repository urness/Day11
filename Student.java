public class Student {
    private String name;

    // Shared by ALL Student objects
    private static int numberOfStudents = 0;

    public Student(String name) {
        this.name = name;
        numberOfStudents++;
    }

    public void display() {
        System.out.println(name);
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }
}