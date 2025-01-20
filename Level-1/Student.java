// Main class
class Main {
    public static void main(String[] args) {
        // Display university name
        System.out.println("University: " + Student.universityName);
        System.out.println();

        // Create student objects
        Student student1 = new Student("Muskan", 1, "A");
        Student student2 = new Student("Nancy", 2, "B");

        // Display student details
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();

        // Update grade for a student
        System.out.println();
        student1.updateGrade("A+");

        // Display total students
        System.out.println();
        Student.displayTotalStudents();
    }
}

class Student {
    // Static variable
    static String universityName = "RGPV";
    private static int totalStudents = 0; 

    // Final variable
    private final int rollNumber;

    // Instance variables
    private String name;
    private String grade;

    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name; 
        this.rollNumber = rollNumber; 
        this.grade = grade; 
        totalStudents++; 
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to update the grade of a student
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " (Roll No: " + rollNumber + ") to " + grade);
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }
}

