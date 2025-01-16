class Main{
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket("Squid Game");

        // Display initial details
        System.out.println("Ticket Details:");
        ticket.displayDetails();

        // Book the ticket
        System.out.println("\nBooking ticket...");
        ticket.bookTicket("A12", 300.0);

        // Display updated ticket details
        System.out.println("\nUpdated Ticket Details:");
        ticket.displayDetails();
    }
}

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Assigned";
        this.price = 0.0;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket successfully booked for " + movieName + " at seat " + seatNumber + " for INR " + price);
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: INR " + price);
    }
}
