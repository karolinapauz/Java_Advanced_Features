package day_1107.patient_homework_example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void shouldGetUsersTallerThan180() {
        //given
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Tom", 14, 200));
        users.add(new User("Bill", 25, 160));
        users.add(new User("Ann", 15, 186));
        UserService userService = new UserService();
        //when
        ArrayList<User> actualTallUsers = userService.getUsersTallerThanGivenHeight(users, 180);
        // command option v sukuria pagal return tipa
        //then
        assertEquals(2, actualTallUsers.size());
        assertEquals(200, actualTallUsers.get(0).getHeight());
        assertEquals(186, actualTallUsers.get(1).getHeight());


    }
}