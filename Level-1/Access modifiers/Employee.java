// Main class
class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee1 = new Employee(1, "Tech", 55000.0);
        System.out.println("Employee 1 Details:");
        employee1.displayEmployeeDetails();
        System.out.println();

        // Modifying salary using the public setter method
        employee1.setSalary(60000.0);
        System.out.println("Updated Employee 1 Details:");
        employee1.displayEmployeeDetails();
        System.out.println();

        // Creating a Manager object
        Manager manager1 = new Manager(2, "HR", 80000.0, "Recruitment");
        System.out.println("Manager 1 Details:");
        manager1.displayManagerDetails();
        System.out.println();

        // Updating the team for the manager
        manager1.updateTeam("Employee Relations");
        System.out.println();

        // Displaying updated manager details
        System.out.println("Updated Manager 1 Details:");
        manager1.displayManagerDetails();
    }
}

// Base class
class Employee {
    public int employeeID;     
    protected String department;  
    private double salary;     

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary 
    public double getSalary() {
        return salary;
    }

    // Setter for salary 
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass
class Manager extends Employee {
    private String team;

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    // Method to display manager details 
    public void displayManagerDetails() {
       
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team: " + team);
        System.out.println("Salary: $" + getSalary());
    }

    // Method to update the team of the manager
    public void updateTeam(String newTeam) {
        this.team = newTeam;
        System.out.println("Manager's team updated to: " + newTeam);
    }
}

