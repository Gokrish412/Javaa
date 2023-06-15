package Collections;
import java.util.*;
class Remove{  
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Weights");
      gym.add(0, "Barbell");
      gym.add(0, "Powerack");
      gym.remove(4);
      System.out.println(gym);
}
}
