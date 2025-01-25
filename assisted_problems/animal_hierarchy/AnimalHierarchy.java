package assisted_problems.animal_hierarchy;

public class AnimalHierarchy {
    public static void main(String[] args) {
        // Create objects of each subclass
        Animal dog = new Dog("Dog", 2);
        Animal cat = new Cat("Cat", 2);
        Animal bird = new Bird("Bird", 1);

        // Polymorphism
        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

        bird.displayInfo();
        bird.makeSound();
    }
}
