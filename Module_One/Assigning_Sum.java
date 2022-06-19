/*
Write a statement that assigns numCoins with numNickels + numDimes. Ex: 5 nickels and 6 dimes results in 11 coins.

Note: These activities may test code with different test values. This activity will perform two tests: the first with nickels = 5 and dimes = 6, the second with nickels = 9 and dimes = 0.
*/

import java.util.Scanner;

public class AssigningSum {
   public static void main (String [] args) {
      int numCoins;
      int numNickels;
      int numDimes;

      numNickels = 5;
      numDimes = 6;

      numCoins = numNickels + numDimes;

      System.out.print("There are ");
      System.out.print(numCoins);
      System.out.println(" coins");
   }
}
