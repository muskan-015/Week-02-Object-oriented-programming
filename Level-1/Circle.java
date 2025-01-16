import java.util.Scanner;
// Main class
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        // Create a Circle object
        Circle circle = new Circle(radius);

        // Display the details of the circle
        circle.showDetails();

        sc.close();
    }
}
// Circle class 
class Circle {
    private int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Method to calculate the area
    public double Area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference
    public double Circumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the results
    public void showDetails() {
        System.out.println("Radius: "+ radius);
        System.out.println("Area: "+ Area());
        System.out.println("Circumference:"+ Circumference());
    }
}




