public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "TITE";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: INR " + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating course instances
        Course course1 = new Course("Java Programming", 12, 3000.0);
        Course course2 = new Course("Web Development", 10, 1400.0);
        Course course3 = new Course("Data Science", 16, 2500.0);

        // Displaying details of each course
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        System.out.println("Course 3 Details:");
        course3.displayCourseDetails();
        System.out.println();

        // Updating institute name
        Course.updateInstituteName("BridgeLabz");

        System.out.println();

        // Displaying details again after updating institute name
        System.out.println("Updated Course Details:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
    }
}
