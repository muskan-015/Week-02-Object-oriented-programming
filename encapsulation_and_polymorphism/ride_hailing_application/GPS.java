package encapsulation_and_polymorphism.ride_hailing_application;

public interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}
