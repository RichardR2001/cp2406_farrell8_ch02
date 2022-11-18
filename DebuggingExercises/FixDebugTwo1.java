public class FixDebugTwo1  // change class name to FixDebugTwo1
{
   public static void main(String[] args)
   {
      int oneInt = 315; // remove .0 since variable is integer and not float
      double oneDouble = 12.4;
      char oneChar = 'A';  // add '' for variable with type character
      System.out.print("The int is ");
      System.out.println(oneInt);    // fix typo error
      System.out.print("The double is ");
      System.out.println(oneDouble);     // add .out command
      System.out.print("The char is ");   // add missing "
      System.out.println(oneChar);
   }
}