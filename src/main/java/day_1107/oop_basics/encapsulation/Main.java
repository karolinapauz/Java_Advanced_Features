package day_1107.oop_basics.encapsulation;

public class Main {
    public static void main(String[] args) {

        Employee tom = new Employee("tom", 8787554, 3400);
        // System.out.println(tom.name() + "  " + tom.personalCode);
        System.out.println(tom.getName() + " " + tom.getSalary());
        System.out.println(tom.getPersonalCode());
        System.out.println(tom.getSalary());
        tom.setSalary(4556);
        System.out.println("Nauja alga " + tom.getSalary());
        tom.setSalary(200);
        System.out.println(tom.getSalary());

        Employee justas = new Employee();
        justas.setName("justas");
        justas.setSalary(5500);
        justas.setPersonalCode(445567722);
        System.out.println(justas);
    }
}
