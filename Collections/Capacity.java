package Collections;
import java.util.*;
class Capacity{  
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Weights");
      gym.ensureCapacity(6);
      gym.add("Barbell");
      gym.add("Powerack");
      System.out.println(gym.size());
      System.out.println(gym);
}
}