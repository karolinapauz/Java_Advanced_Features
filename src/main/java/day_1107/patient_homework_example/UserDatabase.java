package day_1107.patient_homework_example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDatabase {

    public static ArrayList<User> users = new ArrayList<>();

    public static void createDatabaseFromFile() throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/user.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readLine = bufferedReader.readLine();
        while (readLine != null) {
            String[] splitString = readLine.split(",");
            String name = splitString[0];
            int age = Integer.parseInt(splitString[1]);
            int height = Integer.parseInt(splitString[2]);
            users.add(new User(name, age, height));
            readLine = bufferedReader.readLine();
        }
    }
}
