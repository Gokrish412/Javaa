package OOPS;
class Employee
{
    private int emp_id;
    private String name;
    private int div;
    private double salary;

    public int getemp_id()
    {
        return emp_id;
    }
    
    public String getname() {
        return name;
    }
    public int getdiv(){
        return div;
    }
    
    public double getsalary() {
        return salary;
    }
    public void setemp_id(int em)
    {
        emp_id=em;
    }
    
    public void setname(String nm) {
        name = nm;
    }
    public void setdiv(int dv){
        div=dv;
    }

    public void setsalary(double sal) {
        salary = sal;
    }
}

class Empdetails {

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setemp_id(4530);
        e1.setname("Ramesh");
        e1.setdiv(4);
        e1.setsalary(50000);
        System.out.println("Employee No.:"+e1.getemp_id()+"\tName:"+e1.getname()+"\tDivision:"+e1.getdiv()+"\tSalary:"+e1.getsalary());
        

    }
}
