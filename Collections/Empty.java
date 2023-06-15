package Collections;
import java.util.*;
class Empty{  
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Weights");
      gym.add("Barbell");
      gym.add("Powerack");
      gym.set(3, "smith machine");
      gym.clear();
      System.out.println(gym.isEmpty());
}
}