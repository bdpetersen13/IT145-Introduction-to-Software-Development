/*
Write code that uses the input string stream inSS to read input data from string userInput, and updates variables userMonth, userDate, and userYear. Sample output if userinput is "Jan 12 1992":
Month: Jan
Date: 12
Year: 1992
*/

import java.util.Scanner;

public class StringInputStream {
   public static void main (String [] args) {
      Scanner inSS = null;
      String userInput = "Jan 12 1992";
      inSS = new Scanner(userInput);

      String userMonth;
      int userDate;
      int userYear;

      userMonth = inSS.next();
      userDate = inSS.nextInt();
      userYear = inSS.nextInt();

      System.out.println("Month: " + userMonth);
      System.out.println("Date: " + userDate);
      System.out.println("Year: " + userYear);
   }
}
