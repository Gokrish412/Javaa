package Collections;
import java.math.BigInteger;
class Prgm3 {
    public static void main(String args[]) {
        int[] num={1,2,0,0};
        int k=34;
        String l1="";
        String l2="";
        for(int i=0;i<num.length;i++){
            l1=Integer.toString(num[i]);
            l2+=l1;
        }
        String ad=Integer.toString(k);
        BigInteger a=new BigInteger(l2);
        BigInteger b=new BigInteger(ad);
        BigInteger c=a.add(b);
        String out=c.toString();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<out.length();i++){
            res.add(Character.getNumericValue(out.charAt(i)));
        }
        System.out.println(out);
    }
}