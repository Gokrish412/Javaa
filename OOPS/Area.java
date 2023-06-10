package OOPS;

class Square
{
 int area(int x)
 {
  return x * x;
 }
}

class Rectangle
{
 int area(int x, int y)
 {
  return x * y;
 }
}


class Area
{
 public static void main(String args[])
 {
  Square s = new Square();
  Rectangle r = new Rectangle();
  System.out.println("Square: "+ s.area(5));
  System.out.println("Rectangle: "+ r.area(2,6));
 }
}
