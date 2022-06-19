/*
Write an if-else statement that checks patronAge. If 55 or greater, print "Senior citizen", otherwise print "Not senior citizen" (without quotes). End with newline.
*/

import java.util.Scanner;

public class DetectSenior {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int patronAge;

      patronAge = scnr.nextInt();

      if (patronAge >= 55) {
         System.out.println("Senior citizen");
      }
      else {
         System.out.println("Not senior citizen");
      }

   }
}
