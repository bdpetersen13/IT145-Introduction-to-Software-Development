/*
(1) Prompt the user to enter five numbers, being five people's weights. Store the numbers in an array of doubles. Output the array's numbers on one line, each number followed by one space. (2 pts)

Ex:

Enter weight 1: 236
Enter weight 2: 89.5
Enter weight 3: 142
Enter weight 4: 166.3
Enter weight 5: 93

You entered: 236.0 89.5 142.0 166.3 93.0
(2) Also output the total weight, by summing the array's elements. (1 pt)

(3) Also output the average of the array's elements. (1 pt)

(4) Also output the max array element. (2 pts)


Ex:

Enter weight 1: 236
Enter weight 2: 89.5
Enter weight 3: 142
Enter weight 4: 166.3
Enter weight 5: 93

You entered: 236.0 89.5 142.0 166.3 93.0
Total weight: 726.8
Average weight: 145.35999999999999
Max weight: 236.0
*/

import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 5;
      double[] userVals = new double[NUM_ELEMENTS];
      int i;
      int x;

      for (i = 0; i < NUM_ELEMENTS; ++i) {
         System.out.println("Enter weight " + (i + 1) + ": ");
         userVals[i] = scnr.nextDouble();
      }

      System.out.println("");
      System.out.print("You entered: ");
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         System.out.print(userVals[i] + " ");
      }

      System.out.println("");
      double totalWeight = 0.0;
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         totalWeight += userVals[i];
      }
      System.out.println("Total weight: " + totalWeight);

      double averageWeight = 0.0;
      averageWeight = totalWeight / NUM_ELEMENTS;
      System.out.println("Average weight: " + averageWeight);

      double maxWeight = userVals[0];
      for (i =0; i < NUM_ELEMENTS; ++i) {
         if (userVals[i] > maxWeight) {
            maxWeight = userVals[i];
         }
      }
      System.out.println("Max weight: " + maxWeight);

      return;
   }
}
