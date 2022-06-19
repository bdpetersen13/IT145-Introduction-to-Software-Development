/*
Write an expression that prints "Special number" if specialNum is -99, 0, or 44.
*/

import java.util.Scanner;

public class FindSpecialValue {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int specialNum;

      specialNum = scnr.nextInt();

      if (specialNum == -99 || specialNum == 0 || specialNum == 44) {
          System.out.println("Special number");
      }
      else {
          System.out.println("Not special number");
      }
   }
}
