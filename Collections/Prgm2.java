package Collections;
import java.util.*;
class Prgm2 {
    public static void main(String args[]) {
        String para="Bob hit a ball, the hit BALL flew far after it was hit.";
        String ban[]={"hit"};
        String emp="";
        String pl=para.toLowerCase();
        String[] ps=pl.split("\\W+");
        int cc=0,max=0;
        ArrayList<String>l1=new ArrayList<>();
        ArrayList<String>l2=new ArrayList<>();
        for(int i=0;i<ban.length;i++){
            l2.add(ban[i]);
        }
        ArrayList<String>l3=new ArrayList<>(Arrays.asList(ps));
        for(int i=0;i<l3.size();i++){
            if(!l1.contains(l3.get(i))){
                l1.add(l3.get(i));
            }
        }
        for(int i=0;i<l1.size();i++){
                cc=0;
                if(!l2.contains(l1.get(i))){
                    cc=Collections.frequency(l3,l1.get(i));
                }
            if(cc>max){
                max=cc;
                emp=l1.get(i);
            }
        }
        System.out.println(emp);
    }
}