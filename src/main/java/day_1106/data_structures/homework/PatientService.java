package day_1106.data_structures.homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class PatientService {

    PatientDatabase patientDatabase = new PatientDatabase();

    ArrayList<Patient> patientList = patientDatabase.createPatientDatabase();

    public PatientService() throws IOException {
        getAllPatients();
        getOldestPatient();
        System.out.println(findPatientsWithNameStartingWith("Ma"));
        System.out.println(getTallestPatient());
        System.out.println(findPatientsHeavierThanGivenWeight(90));
        System.out.println(getPatientsWithSpecificBloodType("B-"));
        System.out.println(findPatientsTallerThanGivenHeight(1.80));
    }

    public void getAllPatients() {
        System.out.println("All patients: ");
        for (Patient patient : patientList) {
            System.out.println(patient);
        }
    }

    public void getOldestPatient() {
        System.out.println("\nOldest patient: ");
        patientList.stream()
                .max(Comparator.comparing(Patient::getAge))
                .ifPresent(System.out::println);
    }

    public ArrayList<Patient> findPatientsWithNameStartingWith(String partOfName) {
        ArrayList<Patient> foundPatient = new ArrayList<>();
        System.out.println("\nPatients with names starting with " + partOfName + ": ");
        for (Patient patient : patientList) {
            if (patient.getName().startsWith(partOfName)) {
                foundPatient.add(patient);
            }
        }
        return foundPatient;
    }

    public Patient getTallestPatient() {
        System.out.println("\nTallest patient: ");
        Optional<Patient> tallest = patientList.stream()
                .max(Comparator.comparing(Patient::getHeight));
        return tallest.get();
    }

    public ArrayList<Patient> findPatientsHeavierThanGivenWeight(Integer givenWeight) {
        System.out.println("\nHeavy patients: ");
        ArrayList<Patient> heavyPatients = new ArrayList<>();
        for (Patient patient : patientList) {
            if (patient.getWeight() > givenWeight) {
                heavyPatients.add(patient);
            }
        }
        return heavyPatients;
    }

    public ArrayList<Patient> getPatientsWithSpecificBloodType(String givenBloodType) {
        System.out.println("\nPatients with blood type " + givenBloodType + ": ");
        ArrayList<Patient> patientsByBloodType = new ArrayList<>();
        for (Patient patient : patientList) {
            if (givenBloodType.equalsIgnoreCase(patient.getBloodType())) {
                patientsByBloodType.add(patient);
            }
        }
        return patientsByBloodType;
    }

    public ArrayList<Patient> findPatientsTallerThanGivenHeight(double givenHeight) {
        System.out.println("\nPatients taller than " + givenHeight + ": ");
        ArrayList<Patient> tallPatients = new ArrayList<>();
        for (Patient patient : patientList) {
            if (patient.getHeight() > givenHeight) {
                tallPatients.add(patient);
            }
        }
        return tallPatients;
    }

}
