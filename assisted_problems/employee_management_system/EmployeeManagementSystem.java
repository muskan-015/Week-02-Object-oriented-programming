package assisted_problems.employee_management_system;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create objects of each subclass
        Employee manager = new Manager("Muskan", 101, 90000, 10);
        Employee developer = new Developer("Nancy", 102, 80000, "Java");
        Employee intern = new Intern("Pragya", 103, 20000, "RGPV University");

        // Display details for each employee
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();

        System.out.println("Developer Details:");
        developer.displayDetails();
        System.out.println();

        System.out.println("Intern Details:");
        intern.displayDetails();
    }
}
