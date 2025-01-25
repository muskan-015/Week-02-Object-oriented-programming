package encapsulation_and_polymorphism.employee_management_system;

public class PartTimeEmployee extends Employee implements Department {
    private String departmentName;
    private int workingHours;
    private double rate;

    public PartTimeEmployee(int id, String name, double salary, int workingHours, double rate) {
        super(id, name, salary);
        this.workingHours = workingHours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (workingHours * rate);
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
