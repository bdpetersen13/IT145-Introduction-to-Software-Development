/*
(1) Prompt the user to input an integer, a double, a character, and a string, storing each into separate variables. Then, output those four values on a single line separated by a space. (Submit for 2 points).

Enter integer: 99
Enter double: 3.77
Enter character: z
Enter string: Howdy
99 3.77 z Howdy

(2) Extend to also output in reverse. (Submit for 1 point, so 3 points total).

Enter integer: 99
Enter double: 3.77
Enter character: z
Enter string: Howdy
99 3.77 z Howdy
Howdy z 3.77 99

(3) Extend to cast the double to an integer, and output that integer. (Submit for 2 points, so 5 points total).

Enter integer: 99
Enter double: 3.77
Enter character: z
Enter string: Howdy
99 3.77 z Howdy
Howdy z 3.77 99
3.77 cast to an integer is 3
*/

import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt = 0;
      double userDouble = 0.0;
      char userChar;
      String userString;

      System.out.println("Enter integer: ");
      userInt = scnr.nextInt();

      System.out.println("Enter double: ");
      userDouble = scnr.nextDouble();

      System.out.println("Enter character: ");
      userChar = scnr.next().charAt(0);

      System.out.println("Enter string: ");
      userString = scnr.next();

      int intValue = (int) userDouble;

      System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
      System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
      System.out.println(userDouble + " cast to an integer is " + intValue);
      
      return;
   }
}
