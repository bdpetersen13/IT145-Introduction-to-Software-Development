/*
Given a line of text as input, output the number of characters excluding spaces, periods, or commas.

Ex: If the input is:

Listen, Mr. Jones, calm down.
the output is:

21
Note: Account for all characters that aren't spaces, periods, or commas (Ex: "r", "2", "!").
*/

import java.util.Scanner;

public class LabProgram{

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String userText;

		userText = scnr.nextLine();

		long count = 0;

		int i = 0;

		while (i < userText.length()) {

			if (userText.charAt(i) != ' ' && userText.charAt(i) != ',' && userText.charAt(i) != '.') {

				count++;

			}

			i++;

		}

		System.out.println(count);

	}
}
