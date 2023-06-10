package OOPS;

class Sample1 {
  public int add(int x, int y) {
    int add = x + y;
    return add;
  }

  public static void main(String[] args) {
    
    int n1 = 4;
    int n2 = 2;
    Sample1 obj = new Sample1();
    int out = obj.add(n1,n2);
    System.out.println("By adding " + n1+" and "+ n2 + " we get "+ out);
  }
}