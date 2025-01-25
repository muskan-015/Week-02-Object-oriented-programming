package encapsulation_and_polymorphism.employee_management_system;

public class FullTimeEmployee extends Employee implements Department {
    private String departmentName;
    private double fixedSalary;

    public FullTimeEmployee(int id, String name, double salary, double fixedSalary) {
        super(id, name, salary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + fixedSalary;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
