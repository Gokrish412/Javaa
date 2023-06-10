package OOPS.Polymorphism;

class Bike{  
 int speedlimit=90;  
}  
class KTM extends Bike{  
 int speedlimit=150;  

 public static void main(String args[]){  
  Bike obj=new KTM();  
  System.out.println(obj.speedlimit);
}  
}
