import java.util.ArrayList;
// Main Class
 class Main {
    public static void main(String[] args) {
        // Create a university
        University university = new University("RGPV");

        // Create departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Chemical Engineering");

        // Create faculty members
        Faculty faculty1 = new Faculty("Muskan", "Data Science");
        Faculty faculty2 = new Faculty("Nancy", "Artificial Intelligence");
        Faculty faculty3 = new Faculty("Pragya", "Thermodynamics");

        // Add faculty to university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.addFaculty(faculty3);

        // Add faculty to departments
        department1.addFaculty(faculty1);
        department1.addFaculty(faculty2);
        department2.addFaculty(faculty3);

        // Add departments to the university
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Display university details
        System.out.println("\nUniversity Details:");
        university.displayUniversityDetails();

        // Delete the university
        System.out.println("\nDeleting the university...");
        university.deleteUniversity();

        // Display university details after deletion
        System.out.println("\nUniversity Details After Deletion:");
        university.displayUniversityDetails();
    }
}

// Faculty Class
class Faculty {
    private String name;
    private String specialization;

    // Constructor
    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Method to display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + name + ", Specialization: " + specialization);
    }

    public String getName() {
        return name;
    }
}

// Department Class
class Department {
    String departmentName;
    private ArrayList<Faculty> facultyMembers; // Aggregation

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
        System.out.println("Added faculty " + faculty.getName() + " to department " + departmentName);
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayFacultyDetails();
        }
    }
}

// University Class
class University {
    private String universityName;
    private ArrayList<Department> departments; // Composition
    private ArrayList<Faculty> facultyMembers; // Aggregation

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println("Added department: " + department.departmentName + " to university: " + universityName);
    }

    // Method to add a faculty member to the university
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
        System.out.println("Added faculty: " + faculty.getName() + " to university: " + universityName);
    }

    // Method to display university details
    public void displayUniversityDetails() {
        System.out.println("University Name: " + universityName);

        System.out.println("\nDepartments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }

        System.out.println("\nFaculty Members:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayFacultyDetails();
        }
    }

    // Method to delete the university
    public void deleteUniversity() {
        System.out.println("Deleting university: " + universityName);
        departments.clear();
    }
}
