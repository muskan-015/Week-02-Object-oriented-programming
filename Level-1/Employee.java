class Main {
      public static void main(String[] args) {
        // Create employee objects
        Employee employee = new Employee("Muskan Gupta", 99, 60000);

        // Display details
        System.out.println("=== employee details ===");
        employee.showDetails();
      }
    }
class Employee{
    //attributes of class
    private String name;
    private int id;
    private int salary;

    // Constructor
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void showDetails() {
        System.out.println("employee Name: " + name);
        System.out.println("id: " + id);
        System.out.println("salary: "+ salary);
        
    }
}
    
