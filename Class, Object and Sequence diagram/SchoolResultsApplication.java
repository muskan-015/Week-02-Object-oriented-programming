import java.util.ArrayList;
import java.util.List;
public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student(1, "Muskan Gupta", "20XX-0X-15");

        // Add subjects
        student.addSubject(new Subject("Math", "M01", 97));
        student.addSubject(new Subject("Science", "S01", 97));
        student.addSubject(new Subject("English", "H01", 96));

        // Calculate and display the grade
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student);

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Date of Birth: " + student.getDob());
        System.out.println("Overall Grade: " + grade);
    }
}

class Student {
    private int studentID;
    private String studentName;
    private String dob;
    private List<Subject> subjects;

    public Student(int studentID, String studentName, String dob) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.dob = dob;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getDob() {
        return dob;
    }
}

class Subject {
    private String subjectName;
    private String subjectCode;
    private double score;

    public Subject(String subjectName, String subjectCode, double score) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.score = score;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public double getScore() {
        return score;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) {
            return "No subjects available.";
        }

        double totalScore = 0.0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }

        double averageScore = totalScore / subjects.size();

        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 75) {
            return "B";
        } else if (averageScore >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
