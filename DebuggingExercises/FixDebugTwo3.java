public class FixDebugTwo3  // change class name to FixDebugTwo3
// Demonstrates remainder and output
{
   public static void main(String[] args)
   {
      int a = 99, b = 8, result;
      long c = 7777777777777L;      // add an L to the end of the literal
      result = a % b;
      System.out.println("Divide " + a + " by " + b);
      System.out.println("remainder is " + result);      // add . in between System and out
      System.out.print("c is a very large number: ");    // add . in between System and out
      System.out.println(c);                             // add . in between System and out
    }
}