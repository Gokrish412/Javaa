package OOPS.Inheritance;

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Programmer extends Employee {
    void code() {
        System.out.println("Employee is a software developer");
    }
}

public class single {
    public static void main(String[] args) {
        Programmer emp = new Programmer();
        emp.work();
        emp.code(); 
    }
}







