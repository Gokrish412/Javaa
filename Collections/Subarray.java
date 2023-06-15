package Collections;
import java.util.*;
class Subarray{  
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Weights");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Weights");
      gym.add("Barbell");
      gym.add("Powerack");
      gym.add("Weights");
      ArrayList < String > sub_ArrayList = new ArrayList < String > (gym.subList (1, 4));
      System.out.println (sub_ArrayList);
   }
}