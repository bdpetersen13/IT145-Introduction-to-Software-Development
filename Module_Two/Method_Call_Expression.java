/*
Assign to maxSum the max of (numA, numB) PLUS the max of (numY, numZ). Use just one statement. Hint: Call findMax() twice in an expression.
*/

import java.util.Scanner;

public class SumOfMax {
   public static double findMax(double num1, double num2) {
      double maxVal;

      // Note: if-else statements need not be understood to
      // complete this activity
      if (num1 > num2) { // if num1 is greater than num2,
         maxVal = num1;  // then num1 is the maxVal.
      }
      else {             // Otherwise,
         maxVal = num2;  // num2 is the maxVal.
      }
      return maxVal;
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      double numA;
      double numB;
      double numY;
      double numZ;
      double maxSum;

      numA = scnr.nextDouble();
      numB = scnr.nextDouble();
      numY = scnr.nextDouble();
      numZ = scnr.nextDouble();

      maxSum = findMax(numA, numB) + findMax(numY, numZ);

      System.out.print("maxSum is: " + maxSum);
   }
}
