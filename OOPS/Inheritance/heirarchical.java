package OOPS.Inheritance;

class Employees{// parent class
    void work()
    {
        System.out.println("All employees work together");
    }
}
class Emp1 extends Employees{//child 1
    void work()
    {
        System.out.println("Employee1 is working");
    }
}
class Emp2 extends Employees{//child 2
    void work()
    {
        System.out.println("Employee2 is on leave");
    }
}
class Emp3 extends Employees{//child 3
    void work()
    {
        System.out.println("Employee3 is working");
    }
}
class Main{
    public static void main(String args[]){
        Emp3 em3=new Emp3();//
        Emp2 em2=new Emp2();
        Emp1 em1=new Emp1();
        Employees emp=new Employees();
        em3.work();
        em2.work();
        em1.work();
        emp.work();
        
}
}
