/*
Write a switch statement that checks origLetter. If 'a' or 'A', print "Alpha". If 'b' or 'B', print "Beta". For any other character, print "Unknown". Use fall-through as appropriate. End with newline.
*/

import java.util.Scanner;

public class ConvertToGreek {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      char origLetter;

      origLetter = scnr.next().charAt(0);

      String greekLetter = "";
         switch (origLetter) {
            case 'A':
            case 'a':
               greekLetter = "Alpha";
               System.out.println("Alpha");
               break;
            case 'B':
            case 'b':
               greekLetter = "Beta";
               System.out.println("Beta");
               break;
            default:
               greekLetter = "Unknown";
               System.out.println("Unknown");
               break;
         }
   }
}
