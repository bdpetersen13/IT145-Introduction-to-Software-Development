/*
Create a program using classes that does the following in the zyLabs developer below. For this lab, you will be working with two different class files. To switch files, look for where it says "Current File" at the top of the developer window. Click the current file name, then select the file you need.

(1) Create two files to submit:

ItemToPurchase.java - Class definition
ShoppingCartPrinter.java - Contains main() method
Build the ItemToPurchase class with the following specifications:

Private fields
String itemName - Initialized in default constructor to "none"
int itemPrice - Initialized in default constructor to 0
int itemQuantity - Initialized in default constructor to 0
Default constructor
Public member methods (mutators & accessors)
setName() & getName() (2 pts)
setPrice() & getPrice() (2 pts)
setQuantity() & getQuantity() (2 pts)
(2) In main(), prompt the user for two items and create two objects of the ItemToPurchase class. Before prompting for the second item, call scnr.nextLine(); to allow the user to input a new string. (2 pts)

Ex:

Item 1
Enter the item name: Chocolate Chips
Enter the item price: 3
Enter the item quantity: 1

Item 2
Enter the item name: Bottled Water
Enter the item price: 1
Enter the item quantity: 10

(3) Add the costs of the two items together and output the total cost. (2 pts)

Ex:

TOTAL COST
Chocolate Chips 1 @ $3 = $3
Bottled Water 10 @ $1 = $10

Total: $13
*/


/* ITEMSTOPURCHASE */

public class ItemToPurchase {

   private String itemName;
   private int itemPrice;
   private int itemQuantity;

   public ItemToPurchase() {
      this.itemName = "";
      this.itemPrice = 0;
      this.itemQuantity = 0;
   }

   public ItemToPurchase(String itemName, int itemPrice, int itemQuantity) {
      this.itemName = itemName;
      this.itemPrice = itemPrice;
      this.itemQuantity = itemQuantity;
   }

   public int getQuantity() {
      return itemQuantity;
   }

   public void setQuantity(int itemQuantity) {
      this.itemQuantity = itemQuantity;
   }

   public int getPrice() {
      return itemPrice;
   }

   public void setPrice(int itemPrice) {
      this.itemPrice = itemPrice;
   }

   public String getName() {
      return itemName;
   }

   public void setName(String getName) {
      this.itemName = itemName;
   }
}


/* SHOPPINGCARTPRINTER */

import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String productName;
      int productPrice;
      int productQuantity;

      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();
      System.out.println("Item 1");
      System.out.println("Enter the item name: ");
      productName = scanner.nextLine();
      item1.setName(productName);
      System.out.println("Enter the item price: ");
      productPrice = scanner.nextInt();
      item1.setPrice(productPrice);
      System.out.println("Enter the item quantity: ");
      productQuantity = scanner.nextInt();
      item1.setQuantity(productQuantity);
      System.out.println();
      scanner.nextLine();
      System.out.println("Item 2");
      System.out.println("Enter the item name: ");
      productName = scanner.nextLine();
      item2.setName(productName);
      System.out.println("Enter the item price: ");
      productPrice = scanner.nextInt();
      item2.setPrice(productPrice);
      System.out.println("Enter the item quantity: ");
      productQuantity = scanner.nextInt();
      item2.setQuantity(productQuantity);
      System.out.println();
      System.out.println("TOTAL COST");

      int item1Cost = (item1.getQuantity() * item1.getPrice());
      int item2Cost = (item2.getQuantity() * item2.getPrice());
      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1Cost);
      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2Cost);
      System.out.println("Total: $" + ((item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity())));
   }
}
