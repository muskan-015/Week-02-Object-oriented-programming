import java.util.ArrayList;
// Main Class
class Main {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Saket M.G.M");

        // Create students
        Student student1 = new Student("Muskan");
        Student student2 = new Student("Nancy");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");
        Course course3 = new Course("English");

        // Enroll students in courses
        course1.enrollStudent(student1);
        course2.enrollStudent(student1);
        course3.enrollStudent(student2);
        course1.enrollStudent(student2);

        // Display school details
        System.out.println();
        school.displayStudents();

        // Display student courses
        System.out.println();
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();

        // Display course enrollments
        System.out.println();
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
        course3.displayEnrolledStudents();
    }
}

// Course Class
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents; // Association

    // Constructor 
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to add a student to the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); 
            System.out.println("Student " + student.getName() + " enrolled in course: " + courseName);
        }
    }

    // Method to display enrolled students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("  - " + student.getName());
        }
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }
}

// Student Class
class Student {
    private String name;
    private ArrayList<Course> courses; // Association

    // Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to add a course to the student
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course); 
        }
    }

    // Method to display courses the student is enrolled in
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }

    // Getter
    public String getName() {
        return name;
    }
}

// School Class
class School {
    private String schoolName;
    private ArrayList<Student> students; // Aggregation

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " added to school: " + schoolName);
    }

    // Method to display all students in the school
    public void displayStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("  - " + student.getName());
        }
    }
}

