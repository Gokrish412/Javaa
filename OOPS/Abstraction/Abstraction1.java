package OOPS.Abstraction;

abstract class Proofs{
    abstract void aadharcard();
    public void pancard(){
        System.out.println("You have an pan card");
    }
}
class Ramesh extends Proofs
{
    void aadharcard(){
        System.out.println("You have an aadhar card");
    }
}
class Abstraction1{
    public static void main(String args[]){
        Ramesh ramesh=new Ramesh();
        ramesh.aadharcard();
        ramesh.pancard();
}
}
