class MIE
{
  MIE ()
   {
     System.out.println("MIE Properties");
  }
}
class MIEB extends MIE
{
   MIEB ()
{
  System.out.println("MIEB Properties");
  }
}
class MIEC extends MIEB
{
  void MIEC ()
{
 System.out.println("MIEC Properties");
  }
}
class Multi4B
{
 public static void main(String[] args)
{
  MIEC c1 = new MIEC ();
  c1.MIEC ();
  }
}