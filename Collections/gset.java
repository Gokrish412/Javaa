package Collections;
import java.util.*;
class gset{  
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Weights");
      gym.add("Barbell");
      gym.add("Powerack");
      gym.set(3, "smith machine");
      System.out.println(gym.get(3));
}
}