package OOPS.Inheritance;

interface Designer {
    void design();
}

interface Developer {
    void develop();
}

class Employee implements Designer {
    public void design() {
        System.out.println("Employee1 is a designer");
    }
}

class Employee2 implements Developer {
    public void develop() {
        System.out.println("Employee2 is a developer");
    }
}

class Employee3 implements Designer, Developer {
    public void design() {
        System.out.println("Employee3 is designer");
    }

    public void develop() {
        System.out.println("Employee3 is a developer");
    }
}

class multiple {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        Employee2 emp2 = new Employee2();
        Employee3 emp3 = new Employee3();
        emp1.design();
        emp2.develop();
        emp3.design();
        emp3.develop();
}
}
