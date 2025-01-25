package single_inheritance.smart_home_system;

public class SmartHomeSystem {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("001", "On", 20);

        System.out.println("Thermostat Details:");
        thermostat.displayStatus();
    }
}
