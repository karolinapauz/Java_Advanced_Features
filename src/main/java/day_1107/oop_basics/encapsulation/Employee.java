package day_1107.oop_basics.encapsulation;

public class Employee {

    private String name;
    private int personalCode;
    private int salary;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("vardas tuscias arba neegzistuoja");
        }
    }
    // nekuriam personal code setterio nes nenoriu kad vartotojas galetu pakeist


    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 500) {
            System.out.println("maziau nei minimumas");
        } else {
            this.salary = salary;
        }
    }

    public Employee(String name, int personalCode, int salary) {
        this.name = name;
        this.personalCode = personalCode;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", personalCode=" + personalCode +
                ", salary=" + salary +
                '}';
    }
}
