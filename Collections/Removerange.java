package Collections;
import java.util.ArrayList;

class Removerange{
    public static void main(String[] args) {
        ArrayList<Integer> rollno = new ArrayList<>();
        rollno.add(9);
        rollno.add(10);
        rollno.add(11);
        rollno.add(12);
        rollno.subList(1, 3).clear();
        System.out.println("Updated Register Numbers: " +rollno);
    }
}