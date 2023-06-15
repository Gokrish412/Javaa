package Collections;
import java.util.ArrayList;

class foreach {
  public static void main(String[] args) {
    ArrayList<Integer> rollno = new ArrayList<>();
    rollno.add(9);
    rollno.add(10);
    rollno.add(11);
    System.out.println("ArrayList: " + rollno);
    rollno.forEach((e) -> {
      e = e * e;
      System.out.print(e + " ");
    });

  }
}