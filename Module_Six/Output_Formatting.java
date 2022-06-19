/*
Write a single statement that prints outsideTemperature with 2 decimals. End with newline. Sample output:
103.46
*/

public class OutsideTemperatureFormatting {
   public static void main (String [] args) {
      double outsideTemperature;

      outsideTemperature = 103.46432;

      System.out.printf("%4.2f%n", outsideTemperature);

   }
}
