package Collections;
import java.util.*;
class Sort{  
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Weights");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Barbell");
      gym.add("Powerack");
      Collections.sort(gym, Collections.reverseOrder());
      System.out.println(gym);
   }
}