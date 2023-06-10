package OOPS;
class Car{
    void run(){
        System.out.println("max speed");
    }
}
class Hyundai extends Car{
    void run(){ 
        System.out.println("can run upto 180km"); 
    }
}
class Honda extends Car{
    void run(){
        System.out.println("can run upto 160km");
    }
} 
class Tata extends Car{
    void run(){
        System.out.println("can run upto 150 km");
    }
}
class Main{
public static void main(String args[]){
    Car c = new Car(); 
    Car Hyundai=new Hyundai();
    Car Honda=new Honda();
    Car Tata=new Tata();
    c.run();
    Hyundai.run();
    Honda.run();
    Tata.run();
    } 
} 
