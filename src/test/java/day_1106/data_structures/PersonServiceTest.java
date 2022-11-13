package day_1106.data_structures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    void findHighEarnersBadWAYGodWay() {
        PersonService personService = new PersonService();
        Person tim = new Person("Tim", 1200);
        Person rob = new Person("Rob", 780);
        Person mat = new Person("Mat", 2300);
        ArrayList<Person> allPeople = new ArrayList<>(Arrays.asList(tim, rob, mat));
        ArrayList<Person> highEarners = personService.getHighEarners(allPeople);
        assertEquals(2, highEarners.size());
        assertEquals(1200, highEarners.get(0).salary);
        assertEquals(4000, highEarners.get(1).salary);
    }

    @Test
    void testShouldIncreaseSalary() {
        Person tim = new Person("Tim", 1200);
        PersonService personService = new PersonService();
        personService.increasePersonSalary(tim, 2000);
        assertEquals(2000, tim.salary);
    }

    @Test
    void shouldFindHighEarnersBadWay() {
        PersonService personService = new PersonService();
        Person tim = new Person("Tim", 1200);
        Person rob = new Person("Rob", 780);
        Person mat = new Person("Mat", 2300);
        ArrayList<Person> allPeople = new ArrayList<>(Arrays.asList(tim, rob, mat));
        personService.findHighEarners(allPeople);
        //then ???
    }
}