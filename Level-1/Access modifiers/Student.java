// Main class
class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(1, "Muskan", 9.5);
        System.out.println("Student Details:");
        student1.displayStudentDetails();
        System.out.println();

        // Modifying CGPA using public method
        student1.setCGPA(9.8);
        System.out.println("Updated Student Details:");
        student1.displayStudentDetails();
        System.out.println();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(2, "Nancy", 9.2, "Computer Science");
        System.out.println("Postgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
        System.out.println();

        // Updating the name using a method in the subclass
        pgStudent.updateName("Khushi");
        System.out.println("Updated Postgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}
 class Student {
    public int rollNumber;         
    protected String name;         
    private double CGPA;        

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA); 
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        displayStudentDetails(); // Use the method from the parent class
        System.out.println("Specialization: " + specialization);
    }

    // Example of accessing protected member
    public void updateName(String newName) {
        this.name = newName; 
        System.out.println("Name updated to: " + newName);
    }
}

