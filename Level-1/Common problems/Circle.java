public class Circle {
    private double radius;

    // Default constructor 
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double Area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double Circumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void showDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Area());
        System.out.println("Circumference: " + Circumference());
    }

    // Main method
    public static void main(String[] args) {
        // Using the default constructor
        Circle circle = new Circle();
        System.out.println("Default Circle:");
        circle.showDetails();

        System.out.println();

        // Using the parameterized constructor
        Circle C = new Circle(5.0);
        System.out.println("User defined Circle:");
        C.showDetails();
    }
}
