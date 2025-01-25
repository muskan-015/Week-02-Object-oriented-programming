package encapsulation_and_polymorphism.hospital_patient_management;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create patients
        InPatient inPatient = new InPatient("IP01", "Harsh", 30, 2000.0, 5);
        OutPatient outPatient = new OutPatient("OP01", "Harshit", 25, 500.0);

        // Add medical records
        inPatient.addRecord("Admitted for surgery (2025-01-01).");
        inPatient.addRecord("Follow-up checkup");

        outPatient.addRecord("Consultation for fever (2025-01-20).");
        outPatient.addRecord("Prescribed medication");

        Patient[] patients = {inPatient, outPatient};
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }
        }
    }
}
