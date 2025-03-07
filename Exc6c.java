public class Exc6c{
       public static void main(String [] args) {
       try {
            int [] a = {1,2};
               a[10] = 5;
            int result = 55/0;
            System.out.println("result is:"+ result);
            }
            catch(ArithmeticException b)
            {
            System.out.println("Arithmetic exc is: "+b.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException b)
           {
            System.out.println("Array index exc is: "+b.getMessage());
           }
          }
         }
            
             
