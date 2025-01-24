// Superclass
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("General Person");
    }
}

// Subclass
class Teacher extends Person {
    String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

// Subclass
class Student extends Person {
    int grade;

    // Constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Student");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

// Subclass
class Staff extends Person {
    String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Staff");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Main class
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

