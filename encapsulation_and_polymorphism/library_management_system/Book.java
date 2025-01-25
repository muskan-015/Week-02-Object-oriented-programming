package encapsulation_and_polymorphism.library_management_system;

public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrowerName;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Book reserved for " + borrowerName);
            return true;
        } else {
            System.out.println("Already reserved.");
            return false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
