class Student {
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    public String Grade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display detais
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + Grade());
    }

    // Main method 
    public static void main(String[] args) {
        // Create a Student object
        Student stu1 = new Student("Muskan", 99, 96);
        Student stu2 = new Student("Nancy", 100, 93.0);

        // Display details
        System.out.println("Student 1 Details:");
        stu1.showDetails();

        System.out.println("\nStudent 2 Details:");
        stu2.showDetails();
    }
}
