package encapsulation_and_polymorphism.library_management_system;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create library items
        LibraryItem book = new Book("B01", "Time is money", "Franklin");
        LibraryItem magazine = new Magazine("M01", "Times of India", "Editorial Team");
        LibraryItem dvd = new DVD("D01", "Rainy days", "Frady");

        LibraryItem[] items = {book, magazine, dvd};
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }

        System.out.println("Reservation :");
        if (book instanceof Reservable) {
            ((Reservable) book).reserveItem("Muskan");
        }

        if (dvd instanceof Reservable) {
            ((Reservable) dvd).reserveItem("Nancy");
        }

        // Check availability
        System.out.println("\nAvailability check:");
        System.out.println("Book available: " + ((Reservable) book).checkAvailability());
        System.out.println("DVD available: " + ((Reservable) dvd).checkAvailability());
    }
}
