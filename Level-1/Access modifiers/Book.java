// Main class
 class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("123", "Java Programming", "James Gosling");
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();
        System.out.println();

        // Creating an EBook object
        EBook eBook1 = new EBook("456", "Complete Java", "Muskan", "PDF");
        System.out.println("EBook 1 Details:");
        eBook1.displayEBookDetails();
        System.out.println();

        // Updating the author name
        eBook1.updateAuthorName("John Doe");
        System.out.println();

        // Displaying the updated eBook details
        System.out.println("Updated EBook 1 Details:");
        eBook1.displayEBookDetails();
    }
}

//base class
class Book {
    public String ISBN;       
    protected String title;  
    private String author;  

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter
    public String getAuthor() {
        return author;
    }

    // Setter for author (private member)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

//subclass
class EBook extends Book {
    private String fileFormat;

    // Constructor to initialize eBook details
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author); 
        this.fileFormat = fileFormat;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        // Accessing ISBN (public), title (protected) from the parent class
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Format: " + fileFormat);
    }

    // Method to update author name
    public void updateAuthorName(String newAuthor) {
        setAuthor(newAuthor); 
        System.out.println("Author name updated to: " + newAuthor);
    }
}

