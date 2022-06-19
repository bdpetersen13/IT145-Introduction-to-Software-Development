/*
Write code to print the location of any alphabetic character in the 2-character string passCode. Each alphabetic character detected should print a separate statement followed by a newline. Ex: If passCode is "9a", output is:
Alphabetic at 1
Hint: Use two if statements to check each of the two characters in the string, using Character.isLetter().
*/

import java.util.Scanner;

public class FindAlpha {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String passCode;

      passCode = scnr.next();

      if (Character.isLetter(passCode.charAt(0))) {
         System.out.println("Alphabetic at 0");
      }
      if (Character.isLetter(passCode.charAt(1))) {
         System.out.println("Alphabetic at 1");
      }
   }
}
