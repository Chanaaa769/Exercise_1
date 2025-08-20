abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();

    void showDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is writing Java code.");
    }
}

class Designer extends Employee {
    Designer(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is creating UI/UX designs.");
    }
}

class Tester extends Employee {
    Tester(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is testing the application.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Employee e1 = new Developer("Arjun", 70000);
        Employee e2 = new Designer("Meera", 65000);
        Employee e3 = new Tester("Rahul", 60000);

        Employee[] team = {e1, e2, e3};

        for (Employee e : team) {
            e.showDetails();
            e.work();
            System.out.println("-----");
        }
    }
}
