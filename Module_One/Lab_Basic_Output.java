/*
A variable like userNum can store a value like an integer. Extend the given program to print userNum values as indicated. (Submit for 2 points).

(1) Output the user's input.

Enter integer: 4
You entered: 4
(2) Extend to output the input squared and cubed. Hint: Compute squared as userNum * userNum. (Submit for 2 points, so 4 points total).

Enter integer: 4
You entered: 4
4 squared is 16
And 4 cubed is 64!!
(3) Extend to get a second user input into userNum2. Output sum and product. (Submit for 1 point, so 5 points total).

Enter integer: 4
You entered: 4
4 squared is 16
And 4 cubed is 64!!
Enter another integer: 5
4 + 5 is 9
4 * 5 is 20
*/

import java.util.Scanner;

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum = 0;
      int userNum2 = 0;

      System.out.println("Enter integer: ");
      userNum = scnr.nextInt();
      System.out.println("You entered: " + userNum);
      System.out.println(userNum + " squared is " + (userNum * userNum));
      System.out.println("And " + userNum + " cubed is " + (userNum * userNum * userNum) + "!!");
      System.out.println("Enter another integer: ");
      //Scanner scnr = new Scanner(System.in);
      userNum2 = scnr.nextInt();
      System.out.println(userNum + " + " + userNum2 + " is " + (userNum + userNum2));
      System.out.println(userNum + " * " + userNum2 + " is " + (userNum * userNum2));

      return;
   }
}
