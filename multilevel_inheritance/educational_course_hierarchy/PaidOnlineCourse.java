package multilevel_inheritance.educational_course_hierarchy;

public class PaidOnlineCourse extends OnlineCourse {
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
