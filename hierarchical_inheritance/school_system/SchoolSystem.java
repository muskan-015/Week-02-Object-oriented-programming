package hierarchical_inheritance.school_system;

public class SchoolSystem {
    public static void main(String[] args) {
        // Create objects for each role
        Teacher teacher = new Teacher("Muskan", 25, "Mathematics");
        Student student = new Student("Nancy", 19, 10);
        Staff staff = new Staff("Shristi", 40, "Management");

        // Display details
        System.out.println("Teacher Details:");
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        System.out.println("Student Details:");
        student.displayRole();
        student.displayDetails();
        System.out.println();

        System.out.println("Staff Details:");
        staff.displayRole();
        staff.displayDetails();
    }
}
