package encapsulation_and_polymorphism.hospital_patient_management;

public class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private int numberOfDays;
    private String medicalHistory;

    public InPatient(String patientId, String name, int age, double roomCharges, int numberOfDays) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.numberOfDays = numberOfDays;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        return roomCharges * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:\n" + (medicalHistory.isEmpty() ? "No records available." : medicalHistory));
    }
}
