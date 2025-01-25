package encapsulation_and_polymorphism.library_management_system;

public class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // loaned for 7 days only
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrowerName;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 4; // loaned for 3 days
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("DVD reserved for " + borrowerName);
            return true;
        } else {
            System.out.println("already reserved.");
            return false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
