package day_1106.data_structures;

import java.util.ArrayList;

public class DataStructuresMain {

    public static void main(String[] args) {

        String[] names = new String[3]; // fiksuoto dydzio array (masyvas)
        names[0] = "Tomas";
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        ArrayList<String> namesList = new ArrayList<>(); // listas, sarasas //konktreti klase, o List<String> yra interface'as
        namesList.add("Karolina");
        namesList.add("Agne");
        namesList.add("Mantas");
        namesList.forEach(System.out::println);

        namesList.remove("Agne");
        System.out.println(namesList);

        Person tim = new Person("Tim", 1200);
        Person rob = new Person("Rob", 780);
        Person mat = new Person("Mat", 2300);
        Person rick = new Person("Mat", 2300);

        ArrayList<Person> team = new ArrayList<>();
        team.add(tim);
        team.add(rob);
        team.add(0, mat); // ideda si i 0 vieta, o kitus elementus pastumia

        System.out.println(team.contains(rick));

        }

    }
