abstract class shape
{
 abstract void area();
}
class rectangle extends shape
 {
   int b = 15;
   int l = 35;
   void area()
 {
   System.out.println("Area of rect :" +(l*b));
 }
}
class square extends shape
{
  int a = 20;
  void area()
{
  System.out.println("Area of sqr :" +(a*a));
 }
}
class abst4C
{
  public static void main(String[] args)
{
  rectangle r1 = new rectangle();
  square s1 = new square();
  r1.area();
  s1.area();
 }
}