package encapsulation_and_polymorphism.library_management_system;

public interface Reservable {
    boolean reserveItem(String borrowerName);

    boolean checkAvailability();
}
