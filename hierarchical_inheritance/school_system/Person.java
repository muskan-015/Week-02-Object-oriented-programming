package hierarchical_inheritance.school_system;

public class Person {String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("General Person");
    }
}
