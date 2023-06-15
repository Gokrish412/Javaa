package Collections;
import java.util.ArrayList;

class Removeif {
    public static void main(String[] args) {
        ArrayList<Integer> rollno = new ArrayList<>();
        rollno.add(9);
        rollno.add(10);
        rollno.add(11);
        rollno.add(12);
        rollno.add(13);
        rollno.add(14);
        System.out.println("Register Number: " + rollno);
        rollno.removeIf(e -> (e % 2) == 0);;
        System.out.println("Odd Numbers: " + rollno);
    }
}