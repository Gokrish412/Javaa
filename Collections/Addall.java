package Collections;
import java.util.*;
class Addall{  
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Weights");
      gym.add(1,"Pushup board");
      ArrayList<String> gym_equipments = new ArrayList<String>(Arrays.asList("Barbell", "Powerrack"));
      gym.addAll(5,gym_equipments);
      System.out.println(gym);
}
}