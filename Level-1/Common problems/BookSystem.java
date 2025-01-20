public class BookSystem {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Default constructor
    public BookSystem() {
        this.title = "no Title";
        this.author = "no Author";
        this.price = 0.0;
        this.available = true;
    }

    // Parameterized constructor
    public BookSystem(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed the book: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
            return false;
        }
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Unavailable"));
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a book using parameterized constructor
        BookSystem book1 = new BookSystem("DBMS", "Pearson", 599.99, true);

        // Display book details
        book1.display();
        System.out.println();

        // Borrow the book
        book1.borrowBook();
        System.out.println();

        // Try borrowing again
        book1.borrowBook();
        System.out.println();

        // Display book details after borrowing
        book1.display();
    }
}
