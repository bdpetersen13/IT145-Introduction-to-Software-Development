/*
Complete the method definition to output the hours given minutes. Output for sample program:
3.5
*/

import java.util.Scanner;
public class HourToMinConv {
   public static void outputMinutesAsHours(double origMinutes) {

      double hours = origMinutes / 60;
      System.out.print(hours);

   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double minutes;

      minutes = scnr.nextDouble();

      outputMinutesAsHours(minutes); // Will be run with 210.0, 3600.0, and 0.0.
      System.out.println("");
   }
}
