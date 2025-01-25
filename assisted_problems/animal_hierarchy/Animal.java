package assisted_problems.animal_hierarchy;

public class Animal {String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void makeSound() {
        System.out.println("animal sound");
    }

    // Display details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
