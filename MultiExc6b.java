class MultiExc6b {
      public static void main (String[] args) {
      try {
           int a = 10;
           int b = 0;
           int c = a/b;
           int[] d = {90, 2};
           System.out.println(c);
           System.out.println(d[10]);
          }
          catch(ArithmeticException e)
         {
          System.out.println(e);
         }
          catch(ArrayIndexOutOfBoundsException e)
        {
         System.out.println(e);
        }
         System.out.println("After exception handling");
        }
       }
         

