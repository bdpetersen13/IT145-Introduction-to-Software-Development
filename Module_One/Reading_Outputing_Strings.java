/*
Write a program that reads a person's first and last names, separated by a space. Then the program outputs last name, comma, first name. End with newline.

Example output if the input is: Maya Jones
Jones, Maya

*/

import java.util.Scanner;

public class SpaceReplace {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName;
      String lastName;

      firstName = scnr.next();
      lastName = scnr.next();
      System.out.println(lastName + ", " + firstName);

   }
}
