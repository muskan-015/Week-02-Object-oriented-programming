// Base class
class Course {
    String courseName;
    int duration; // in hours

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: INR " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: INR " + calculateFinalFee());
    }
}

// Main class
public class EducationalCourseHierarchy {
    public static void main(String[] args) {

        PaidOnlineCourse paidCourse = new PaidOnlineCourse(
                "Java Programming",40,"BridgeLabz",true,2000.0,10.0 );

        // Display details of the paid online course
        paidCourse.displayDetails();
    }
}
