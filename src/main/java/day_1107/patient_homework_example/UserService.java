package day_1107.patient_homework_example;

import java.util.ArrayList;

public class UserService {
    //metodas kad grazintu visus aukstesnius userius
    public ArrayList<User> getUsersTallerThanGivenHeight(ArrayList<User> users, int heightMargin) {
        ArrayList<User> tallUsers = new ArrayList<>();
        for (User user : users) {
            if (user.getHeight() >= heightMargin) {
                tallUsers.add(user);
            }
        }
        return tallUsers;
    }
    public void printUserData (ArrayList<User> users) {
        for (User user : users) {
            System.out.println("Vardas: " + user.getName() + ", ugis: " + user.getHeight() + ", amzius: " + user.getAge());
        }
    }
}
