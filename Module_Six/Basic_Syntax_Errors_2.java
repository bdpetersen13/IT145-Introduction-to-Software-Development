/*
Retype the statements, correcting the syntax errors.
System.out.println("Num: " + songnum);
System.out.println(int songNum);
System.out.println(songNum " songs");
Note: These activities may test code with different test values. This activity will perform two tests: the first with songNum = 5, the second with songNum = 9.
*/

import java.util.Scanner;

public class Errors {
   public static void main (String [] args) {
      int songNum;

      songNum = 5;

      System.out.println("Num: " + songNum);
      System.out.println(songNum);
      System.out.println(songNum + " songs");

   }
}
