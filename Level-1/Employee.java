// Main class
class Main {
    public static void main(String[] args) {
        // Display the company name
        System.out.println("Company: " + Employee.companyName);
        System.out.println();

        // Create employee objects
        Employee emp1 = new Employee("Muskan", 101, "Software Engineer");
        Employee emp2 = new Employee("Nancy", 102, "Project Manager");

        // Display employee details
        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();

        // Display total employees
        System.out.println();
        Employee.displayTotalEmployees();
    }
}

class Employee {
    // Static variable
    static String companyName = "Capegemini";
    private static int totalEmployees = 0;

    // Final variable
    private final int id;

    // Instance variables
    private String name;
    private String designation;

    // Constructor
    public Employee(String name, int id, String designation) {
        this.name = name; 
        this.id = id; 
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        // Using instanceof to check the object type
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("The object is not an instance of the Employee class.");
        }
    }
}

