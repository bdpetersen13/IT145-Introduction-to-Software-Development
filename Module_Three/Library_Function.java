/*
Assign the size of userInput to stringSize. Ex: if userInput is "Hello", output is:
Size of userInput: 5
*/

import java.util.Scanner;

public class StringSize {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;
      int stringSize;

      userInput = scnr.nextLine();

      stringSize = userInput.length();

      System.out.println("Size of userInput: " + stringSize);

      return;
   }
}
