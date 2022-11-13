package day_1107.patient_homework_example;

import java.io.IOException;
import java.util.ArrayList;

public class UserMain {
    public static void main(String[] args) throws IOException {

        UserService userService = new UserService();
        System.out.println(UserDatabase.users);
        UserDatabase.createDatabaseFromFile();
        System.out.println(UserDatabase.users);


        ArrayList<User> tallUsers = userService.getUsersTallerThanGivenHeight(UserDatabase.users, 180);
        System.out.println(tallUsers);
        System.out.println();
        userService.printUserData(UserDatabase.users);
        System.out.println();
        userService.printUserData(tallUsers);

    }
}
