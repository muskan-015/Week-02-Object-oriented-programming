package encapsulation_and_polymorphism.employee_management_system;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, "Muskan", 50000, 20000);
        fullTimeEmp.assignDepartment("Development");
        employees[0] = fullTimeEmp;

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, "Nancy", 30000, 20, 500);
        partTimeEmp.assignDepartment("Development");
        employees[1] = partTimeEmp;

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }

        }
    }
}

