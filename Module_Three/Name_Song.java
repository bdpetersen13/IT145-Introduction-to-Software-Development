/*
Modify songVerse to play "The Name Game" (OxfordDictionaries.com), by replacing "(Name)" with userName but without the first letter.

Ex: If userName = "Kaitlin" and songVerse = "Banana-fana fo-f(Name)!", the program prints:
Banana-fana fo-faitlin!
Ex: If userName = "Kaitlin" and songVerse = "Fee fi mo-m(Name)", the program prints:
Fee fi mo-maitlin
Note: You may assume songVerse will always contain the substring "(Name)".
*/

import java.util.Scanner;

public class NameSong {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userName;
      String songVerse;

      userName = scnr.nextLine();
      userName = userName.substring(1); // Remove first character

      songVerse = scnr.nextLine();

      // Modify songVerse to replace (Name) with userName without first character

      songVerse = songVerse.replace("(Name)", userName.substring(0));

      System.out.println(songVerse);
   }
}
