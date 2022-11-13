package day_1106.data_structures.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PatientDatabase {

    public static ArrayList<Patient> patients = new ArrayList<>();

    public ArrayList<Patient> createPatientDatabase() throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/patients.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readLine = bufferedReader.readLine();
        while (readLine != null) {
            String[] splitString = readLine.split(",");
            String name = splitString[0];
            int age = Integer.parseInt(splitString[1]);
            String bloodType = splitString[2];
            double height = Double.parseDouble(splitString[3]);
            int weight = Integer.parseInt(splitString[4]);
            Patient patient = new Patient(name, age, bloodType,height, weight);
            patients.add(patient);
            readLine = bufferedReader.readLine();
        }
        return patients;
    }

}
