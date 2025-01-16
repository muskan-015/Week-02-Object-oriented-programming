import java.util.Scanner;

// Main class
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter the title of the book: ");
        String title = sc.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = sc.nextLine();

        System.out.print("Enter the price of the book: ");
        double price = sc.nextDouble();

        // Create a Book object
        Book book = new Book(title, author, price);

        // Display the book details
        book.display();

        sc.close();
    }
}

// Book class definition
class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    public void display() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: "+  price);
    }
}
