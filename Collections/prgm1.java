package Collections;
import java.util.*;
class Prgm1{
  public static void main(String[] args){
    ArrayList<String> gym = new ArrayList<>();
    gym.add("Shoulder press");
    gym.add("Front pulls");
    gym.add("Lateral raise");
    gym.add("Upright rows");
    Iterator iteration = gym.iterator();
    while(iteration.hasNext()){
      System.out.print(iteration.next()+",");
    }
  }
}