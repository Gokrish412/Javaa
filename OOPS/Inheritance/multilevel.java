package OOPS.Inheritance;

class Employees {
    void work() {
        System.out.println("Employees are working");
    }
}

class Employee1 extends Employees{
    void emp1() {
        System.out.println("Employee1 is a developer");
    }
}

class Employee2 extends Employee1 {
    void emp2() {
        System.out.println("Employee2 is a designer");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Employee2 det = new Employee2();
        det.work();
        det.emp1();
        det.emp2(); 
    }
}

