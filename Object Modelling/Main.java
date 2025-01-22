import java.util.ArrayList;
// Main Class
class Main {
    public static void main(String[] args) {
        // Create professors
        Professor prof1 = new Professor("Dr. Muskan", "Mathematics");
        Professor prof2 = new Professor("Dr. Khushi", "Computer Science");

        // Create students
        Student student1 = new Student("Mahak");
        Student student2 = new Student("Nancy");

        // Create courses
        Course course1 = new Course("Calculus");
        Course course2 = new Course("Programming");

        // Assign professors to courses
        course1.assignProfessor(prof1);
        course2.assignProfessor(prof2);

        // Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        course2.enrollStudent(student1);

        // Display details
        System.out.println();
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();

        prof1.displayProfessorDetails();
        prof2.displayProfessorDetails();
    }
}

// Course Class
class Course {
    private String courseName;
    private Professor professor; // Aggregation
    private ArrayList<Student> enrolledStudents; // Association

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to course: " + courseName);
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this);
            System.out.println("Student " + student.getName() + " enrolled in course: " + courseName);
        }
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "None"));
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("  - " + student.getName());
        }
    }

    // Getter
    public String getCourseName() {
        return courseName;
    }
}

// Professor Class
class Professor {
    private String name;
    private String specialization;

    // Constructor
    public Professor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Method to display professor details
    public void displayProfessorDetails() {
        System.out.println("Professor: " + name + ", Specialization: " + specialization);
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

    // Method to add a course to the student's list
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course); 
        }
    }

    // Getter
    public String getName() {
        return name;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }
}

