/*
Create a conditional expression that evaluates to string "negative" if userVal is less than 0, and "non-negative" otherwise. Ex: If userVal is -9, output is:
-9 is negative.
*/

import java.util.Scanner;

public class NegativeOrPositive {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String condStr;
      int userVal;

      userVal = scnr.nextInt();

      condStr =  (userVal >= 0) ? "non-negative" : "negative";

      System.out.println(userVal + " is " + condStr + ".");
   }
}
