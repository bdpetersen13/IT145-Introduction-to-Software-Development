/*

3.15.2: Basic while loop with user input.
Write an expression that executes the loop while the user enters a number greater than or equal to 0.


Note: These activities may test code with different test values. This activity will perform three tests, with user input of 9, 5, 2, -1, then with user input of 0, -17, then with user input of 0 1 0 -1.

Also note: If the submitted code has an infinite loop, the system will stop running the code after a few seconds, and report "Program end never reached." The system doesn't print the test case that caused the reported message.
*/

import java.util.Scanner;

public class NonNegativeLooper {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;

      userNum = scnr.nextInt();

      while (userNum >= 0) {
         System.out.println("Body");
         userNum = scnr.nextInt();
      }
      System.out.println("Done.");
   }
}
