/*

This program outputs a downwards facing arrow composed of a rectangle and a right triangle. The arrow dimensions are defined by user specified arrow base height, arrow base width, and arrow head width.

(1) Modify the given program to use a loop to output an arrow base of height arrowBaseHeight. (1 pt)



(2) Modify the given program to use a loop to output an arrow base of width arrowBaseWidth. Use a nested loop in which the inner loop draws the *’s, and the outer loop iterates a number of times equal to the height of the arrow base. (1 pt)



(3) Modify the given program to use a loop to output an arrow head of width arrowHeadWidth. Use a nested loop in which the inner loop draws the *’s, and the outer loop iterates a number of times equal to the height of the arrow head. (2 pts)



(4) Modify the given program to only accept an arrow head width that is larger than the arrow base width. Use a loop to continue prompting the user for an arrow head width until the value is larger than the arrow base width. (1 pt)

while (arrowHeadWidth <= arrowBaseWidth) {
   System.out.println("Enter arrow head width: ");
   arrowHeadWidth = scnr.nextInt();
}


Example output for arrowBaseHeight = 5, arrowBaseWidth = 2, and arrowHeadWidth = 4:

Enter arrow base height: 5
Enter arrow base width: 2
Enter arrow head width: 4
**
**
**
**
**
****
***
**
*
*/

import java.util.Scanner;

public class DrawHalfArrow {
    public static void main(String[] args)
   {
       Scanner Obj = new Scanner(System.in);
        int arrowBaseHeight = 0;
        int arrowBaseWidth = 0;
        int arrowHeadWidth = 0;

       System.out.println("Enter arrow base height: ");
       arrowBaseHeight = Obj.nextInt();
       System.out.println("Enter arrow base width: ");
       arrowBaseWidth = Obj.nextInt();

        while (arrowHeadWidth <= arrowBaseWidth) {
           System.out.println("Enter arrow head width: ");
           arrowHeadWidth = Obj.nextInt();
       }

for (int temp1=1; temp1<=arrowBaseHeight; temp1++)
       {
for(int temp2=1; temp2<=arrowBaseWidth; temp2++)
            {
                 System.out.print("*");
           }
           System.out.println();
         }

        for(;arrowHeadWidth>0; arrowHeadWidth--)
       {
for(int temp3=1; temp3<=arrowHeadWidth; temp3++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}
