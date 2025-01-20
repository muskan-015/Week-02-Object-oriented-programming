
// Main class
class Main {
    public static void main(String[] args) {
        // Display library name using the static method
        Book.displayLibraryName();
        System.out.println();

        // Create book objects
        Book book1 = new Book("DBMS", "Pearson", "1234");
        Book book2 = new Book("OOPs", "George", "5678");

        // Display book details
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}

class Book {
    // Static variable 
    static String libraryName = "Central Library";

    // Final variable
    private final String isbn;

    // Instance variables
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author; 
        this.isbn = isbn; 
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        // Using instanceof to verify the object type
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("The object is not an instance of the Book class.");
        }
    }
}
