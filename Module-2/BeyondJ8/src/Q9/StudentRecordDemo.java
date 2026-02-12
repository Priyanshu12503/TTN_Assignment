package Q9;

public class StudentRecordDemo {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Aman", "10th");
        Student s2 = new Student(1, "Aman", "10th");
        Student s3 = new Student(2, "Riya", "12th");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}

record Student(Integer id, String name, String standard) {

    public Student {
        if (id == null || name == null || standard == null) {
            throw new IllegalArgumentException("Null values are not allowed");
        }
    }
}
