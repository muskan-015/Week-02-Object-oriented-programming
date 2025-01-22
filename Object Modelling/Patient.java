import java.util.ArrayList;
// Main Class
class Main {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Mahak", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Mahak", "Dermatologist");

        // Create patients
        Patient patient1 = new Patient("Muskan");
        Patient patient2 = new Patient("Nancy");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display hospital details
        System.out.println("\nHospital Details:");
        hospital.displayHospitalDetails();
    }
}

// Patient Class
class Patient {
    private String name;
    private ArrayList<Doctor> doctors; // Association

    // Constructor
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Method to add a doctor to the patient
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor); 
            doctor.addPatient(this); 
            System.out.println("Patient " + name + " is consulting with Doctor " + doctor.getName());
        }
    }

    // Method to display all doctors consulted by the patient
    public void displayConsultedDoctors() {
        System.out.println("Patient: " + name);
        System.out.println("Consulted Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  - " + doctor.getName());
        }
    }

    public String getName() {
        return name;
    }
}

// Doctor Class
class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Patient> patients; // Association

    // Constructor
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Method to add a patient to the doctor
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient); 
        }
    }

    // Method to consult a patient
    public void consult(Patient patient) {
        addPatient(patient);
        System.out.println("Doctor " + name + " (" + specialization + ") is consulting Patient " + patient.getName());
    }

    // Method to display all patients consulted by the doctor
    public void displayConsultedPatients() {
        System.out.println("Doctor: " + name + " (" + specialization + ")");
        System.out.println("Consulted Patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName());
        }
    }

    public String getName() {
        return name;
    }
}

// Hospital Class
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors; // Association
    private ArrayList<Patient> patients; // Association

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            System.out.println("Doctor " + doctor.getName() + " added to " + hospitalName);
        }
    }

    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            System.out.println("Patient " + patient.getName() + " added to " + hospitalName);
        }
    }

    // Method to display hospital details
    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("\nDoctors:");
        for (Doctor doctor : doctors) {
            doctor.displayConsultedPatients();
        }
        System.out.println("\nPatients:");
        for (Patient patient : patients) {
            patient.displayConsultedDoctors();
        }
    }
}

