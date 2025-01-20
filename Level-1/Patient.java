// Main class
class Main {
    public static void main(String[] args) {
        // Display the hospital name
        System.out.println("Hospital: " + Patient.hospitalName);
        System.out.println();

        // Create patient objects
        Patient patient1 = new Patient("Muskan", 20, "Fever", 1);
        Patient patient2 = new Patient("Nancy", 22, "Headache", 2);

        // Display patient details
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();

        // Display total patients
        System.out.println();
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}

class Patient {
    // Static variable
    static String hospitalName = "AIIMS Hospital";
    private static int totalPatients = 0; 

    // Final variable
    private final int patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name; 
        this.age = age; 
        this.ailment = ailment; 
        this.patientID = patientID; 
        totalPatients++; 
    }

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("The object is not an instance of the Patient class.");
        }
    }
}

