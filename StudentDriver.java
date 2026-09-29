public class StudentDriver {   
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Carlos");
        System.out.println(Student.getNumberOfStudents());
    }   
}
