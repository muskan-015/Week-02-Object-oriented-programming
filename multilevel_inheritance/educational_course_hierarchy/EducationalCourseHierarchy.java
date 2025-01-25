package multilevel_inheritance.educational_course_hierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {

        PaidOnlineCourse paidCourse = new PaidOnlineCourse(
                "Java Programming",40,"BridgeLabz",true,2000.0,10.0 );

        // Display details of the paid online course
        paidCourse.displayDetails();
    }
}
