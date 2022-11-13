package day_1106.data_structures;

import java.util.ArrayList;

public class PersonService {

    public void findHighEarners(ArrayList<Person> people) {
        for (Person person : people) {
            if (person.salary > 1000) {
                System.out.println(person.name + " earns " + person.salary);
            }
        }
    }

    public ArrayList<Person> getHighEarners(ArrayList<Person> people) {
        ArrayList<Person> highEarners = new ArrayList<>();
        for (Person person : people) {
            if (person.salary >= 1000) {
                highEarners.add(person);
            }
        }
        return highEarners;
    }
    public void increasePersonSalary(Person person, Integer newSalary) {
        person.salary = newSalary;
    }

    public void printPeople(ArrayList<Person> people) {
        System.out.println(people);
    }
}

