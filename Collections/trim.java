package Collections;
import java.util.*;
class trim{ 
   public static void main(String args[]){  
        
      ArrayList<String> gym=new ArrayList<String>();  
      gym.add("Dumbbell");
      gym.add("Situpbar");
      gym.add("Forearm Strengthner");
      gym.add("Weights");
      gym.add("Barbell");
      gym.add("Powerack");
      gym.trimToSize();
      System.out.println(gym.size());
      System.out.println(gym);
}
}
