import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        // Create independent Book objects
        Book book1 = new Book("OOPs", "Pearson");
        Book book2 = new Book("DBMS", "Pearson");
        Book book3 = new Book("Data Structure", "Pearson");
        Book book4 = new Book("Computer network", "Pearson");

        // Create Library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);
        library2.addBook(book4);

        // Display library details
        System.out.println();
        library1.displayLibraryDetails();
        System.out.println();
        library2.displayLibraryDetails();
    }
}

class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String libraryName;
    private ArrayList<Book> books; //Aggregation

    // Constructor 
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle() + " to library: " + libraryName);
    }

    // Method to display library details and its books
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books in the Library:");
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}

