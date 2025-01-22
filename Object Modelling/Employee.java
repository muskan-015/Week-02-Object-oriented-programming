import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("CG");

        // Create departments
        Department department1 = new Department("IT Department");
        Department department2 = new Department("HR Department");

        // Create employees and add them to departments
        Employee emp1 = new Employee("Muskan", "Software Engineer");
        Employee emp2 = new Employee("Nancy", "System Administrator");
        Employee emp3 = new Employee("Ankit", "HR Manager");
        Employee emp4 = new Employee("Pragya", "Recruiter");

        department1.addEmployee(emp1);
        department1.addEmployee(emp2);

        department2.addEmployee(emp3);
        department2.addEmployee(emp4);

        // Add departments to the company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display company details
        System.out.println("Company Details:");
        company.displayCompanyDetails();

        // Delete the company
        System.out.println("\nDeleting the company...");
        company.deleteCompany();

        // Try displaying company details after deletion
        System.out.println("\nCompany Details After Deletion:");
        company.displayCompanyDetails();
    }
}

class Employee {
    private String name;
    private String designation;

    // Constructor
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("  Employee Name: " + name + ", Designation: " + designation);
    }
}

class Department {
    private String departmentName;
    private ArrayList<Employee> employees; // Composition

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments; // Composition
    // Constructor to initialize company details
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display company details
    public void displayCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Method to "delete" the company
    public void deleteCompany() {
        System.out.println("Deleting company: " + companyName);
        departments.clear(); 
    }
}

