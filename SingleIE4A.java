class A
{
  A()
   {
     System.out.println("Inside A");
  }
}
class B extends A
{
  void B()
{
  System.out.println("Inside B");
  }
}
class SingleIE 4A
{
 public static void main(String[] args)
{
  B b1 = new B();
  b1.B();
 }
}