package Collections;
import java.util.*;
class Prblm1{
    public static void main(String args[]) {
        int c=0;
        String[] names={"Gokul","Ashwin","Prem","Anandh","Ramesh","Ashwin"};
        ArrayList<String>l1 = new ArrayList<>();
        for(int i=0;i<names.length;i++){
            if(l1.contains(names[i])==false){
                l1.add(names[i]);
                c++;
            }
        }
        for(int i=0;i<c;i++){
            System.out.println(l1.get(i));
        }
    }
}