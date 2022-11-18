import javax.swing.JOptionPane;
public class FixDebugTwo4  // change class name to FixDebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final double TAX = 0.06;
      // add null to indicate that it is not associated parent dialog
      costString = JOptionPane.showInputDialog(null,
              "Enter price of item you are buying", "Purchases",
         JOptionPane.INFORMATION_MESSAGE);
      cost = Double.parseDouble(costString); // change type from integer to double
      JOptionPane.showMessageDialog(null,"With " + TAX * 100 +
         "% tax,  purchase  is $" + (cost - cost * TAX));   // change tax to TAX to indicate the use of constant
   }
}
